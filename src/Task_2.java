public class Task_2 {
    public static void main(String[] args) {
        final String string = "hello world";
        System.out.println("String -  before remote:   " + string);

        char chars = 'o';
        System.out.println("String -  after remote:   " + delete(string, chars));
    }
   public static String delete(String string, char chars) {
        return string.replace(chars+"", "");
   }
}
