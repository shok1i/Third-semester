package Work_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class CalculatorController {
    private CalculatorView view;

    public CalculatorController(CalculatorView view) {
        this.view = view;

        view.addButtonListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonLabel = e.getActionCommand();
            String input = view.getInputFieldText();

            if (buttonLabel.equals("=")) {
                double result = evaluateExpression(input);
                view.setInputFieldText(String.valueOf(result));
            }
            else if(buttonLabel.equals("Backword")){
                input = input.substring(0,input.length() -1);
                view.setInputFieldText(input);
            }
            else {
                view.setInputFieldText(input + buttonLabel);
            }
        }

        private double evaluateExpression(String expression) {
            double result = 0;
            try {
                Stack<Double> stack = new Stack<>();

                String[] tokens = expression.split(" ");

                result = RPNCalculator.calculate(expression);
            }
            catch(Exception e){
                System.out.println("«Невозможно выполнить POP для пустого стека»");
            }
            return result;
        }

        private boolean isNumber(String token) {
            try {
                Double.parseDouble(token);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private double performOperation(String operator, double operand1, double operand2) {
            switch (operator) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    return operand1 / operand2;
                default:
                    throw new IllegalArgumentException("Неверный оператор: " + operator);
            }
        }
    }
}
