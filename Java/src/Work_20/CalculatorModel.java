package Work_20;

public class CalculatorModel {
    private StringBuilder input;
    private String operator;
    private double result;

    public CalculatorModel() {
        input = new StringBuilder();
        operator = "";
        result = 0;
    }

    public String getInput() {
        return input.toString();
    }

    public void appendToInput(String str) {
        input.append(str);
    }

    public void setOperator(String op) {
        operator = op;
    }

    public void calculate() {
        double operand1 = Double.parseDouble(input.toString());
        double operand2 = result;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
        input.setLength(0);
    }

    public String getResult() {
        return String.valueOf(result);
    }
}
