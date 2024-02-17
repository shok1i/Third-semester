package Work_20;

import java.util.Stack;

public class RPNCalculator {
 // String input = "2 2 * 3 3 * -"; double result = calculate(input)
    public static double calculate(String input) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
    }
    public static double performOperation(String operator, double operand1, double operand2) {
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
