public class Task_8 {
    public static void main(String[] args) {
        CustomDouble customDouble = new CustomDouble(5,10.2);
        System.out.println("Перше число = " + customDouble);

        CustomDouble customDouble1 = new CustomDouble(4, 5.3);
        System.out.println("Друге число = " + customDouble1);

        customDouble.sum(customDouble1);
        System.out.println("Сума першого та другого чисел = " + customDouble.sum(customDouble1));

        customDouble.subtraction(customDouble1);
        System.out.println("Різниця першого та другого чисел = " +  customDouble.subtraction(customDouble1));

        System.out.println("Порівняння першого та другого чисел: " );
        customDouble.comparison(customDouble1);

        System.out.println("Equals першого та другого чисел: " + customDouble.equals(customDouble1));
        System.out.println("HashCode першого числа: " + customDouble.hashCode());
        System.out.println("HashCode другого числа: " + customDouble1.hashCode());

    }
}
