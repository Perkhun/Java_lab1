import java.util.Scanner;

public class Task_9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double number1 = getDouble();
        double number2 = getDouble();
        char operation = getOperation();
        CustomDoubleForCalc result = calculate(number1, number2, operation);
        System.out.println("Відповіть: " + result);
    }
    private static CustomDoubleForCalc calculate(double number1, double number2, char operation) {
        CustomDoubleForCalc result = null;
        CustomDoubleForCalc num1 = new CustomDoubleForCalc(number1);
        CustomDoubleForCalc num2 = new CustomDoubleForCalc(number2);
        switch (operation) {
            case '+':
                result = num1.sum(num2);
                break;
            case '-':
                result = num1.subtraction(num2);
                break;
            case '*':
                result = num1.multiplication(num2);
                break;
            case '/':
                result = num1.division(num2);
                break;
            default:
                System.out.println("Помилка! ");
                result = calculate(number1, number2, getOperation());
        }
        return result;
    }

    private static char getOperation() {
        System.out.println("Введіть дію, яку потрібно виконати:  ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Помилка! ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private static double getDouble() {
        System.out.println("Введіть число: ");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        }
        else {
            System.out.println("Помилка! ");
            scanner.next();
            number = getDouble();
        }
        return  number;
    }
}
