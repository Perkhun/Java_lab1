public class Task_2 {
    public static void main(String[] args) {
        final String stringOne = "hello world";
        System.out.println("String one -  before remote:   " + stringOne);

        char charOne = 'o';
        System.out.println("String One -  after remote:   " + delete(stringOne, charOne));
    }
   public static String delete(String stringOne, char charOne) {
        return stringOne.replace(charOne+"", "");
   }
}
