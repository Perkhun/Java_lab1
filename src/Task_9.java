
public class Task_9 {
    public static void main(String[] args) {
        CustomDouble numberOne = new CustomDouble(5, 0.2);
        CustomDouble numberTwo = new CustomDouble(7, 0.3);
        System.out.println("Plus: " + Calculator.plus(numberOne, numberTwo));
        System.out.println("Subtract: " + Calculator.subtract(numberOne, numberTwo));
        System.out.println("Multiply: " + Calculator.multiply(numberOne, numberTwo));
        System.out.println("Divide: " + Calculator.divide(numberOne, numberTwo));
    }
}
