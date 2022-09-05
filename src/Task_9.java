public class Task_9 {
    public static void main(String[] args) {
        CustomDouble numberOne = new CustomDouble(5, 0.2);
        CustomDouble numberTwo = new CustomDouble(7, 0.3);
        operations(numberOne, numberTwo, '+');
        operations(numberOne, numberTwo, '-');
        operations(numberOne, numberTwo, '*');
        operations(numberOne, numberTwo, '/');
    }
    public static void operations(CustomDouble numberOne, CustomDouble numberTwo, char operator) {
        switch (operator) {
            case '+' ->
                    System.out.println(numberOne + " + " + numberTwo + " = " + Calculator.plus(numberOne, numberTwo));
            case '-' ->
                    System.out.println(numberOne + " - " + numberTwo + " = " + Calculator.subtract(numberOne, numberTwo));
            case '*' ->
                    System.out.println(numberOne + " * " + numberTwo + " = " + Calculator.multiply(numberOne, numberTwo));
            case '/' ->
                    System.out.println(numberOne + " / " + numberTwo + " = " + Calculator.divide(numberOne, numberTwo));
            default -> System.out.println("ERROR");
        }
    }
}
