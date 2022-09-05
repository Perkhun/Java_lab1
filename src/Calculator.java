public class Calculator {
    public static double plus (CustomDouble num1, CustomDouble num2) {
        return num1.toDouble() + num2.toDouble();
    }
    public static double subtract (CustomDouble num1, CustomDouble num2) {
        return num1.toDouble() - num2.toDouble();
    }
    public static double multiply (CustomDouble num1, CustomDouble num2) {
        return num1.toDouble() * num2.toDouble();
    }
    public static double divide(CustomDouble num1, CustomDouble num2) {
        if (num2.toDouble() == 0. ) {
            System.out.println("ERROR");
            return -1;
        }
        return num1.toDouble() / num2.toDouble();
    }
}
