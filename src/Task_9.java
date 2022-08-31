import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        CustomDouble number = new CustomDouble(5, 0.2);
        System.out.println("Plus: " + number.plus(5.4));
        System.out.println("Subtract: " + number.subtract(3.1));
        System.out.println("Multiply: " + number.multiply(3.5));
        System.out.println("Divide: " + number.divide(1.2));
    }
}
