public class Task_8 {
    public static void main(String[] args) {
        CustomDouble customDouble = new CustomDouble(5,0.2);
        System.out.println("Number one = " + customDouble);

        CustomDouble customDouble1 = new CustomDouble(4, 0.3);
        System.out.println("Number two = " + customDouble1);

        customDouble.plus(customDouble1);
        System.out.println("Number one + number two = " + customDouble.plus(customDouble1));

        customDouble.subtract(customDouble1);
        System.out.println("Number one - number two = " +  customDouble.subtract(customDouble1));

        System.out.println("Comparison: " );
        customDouble.compare(customDouble1);

        System.out.println("Equals: " + customDouble.equals(customDouble1));
        System.out.println("HashCode number one: " + customDouble.hashCode());
        System.out.println("HashCode number two: " + customDouble1.hashCode());

    }
}
