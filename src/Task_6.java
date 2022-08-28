public class Task_6 {
    public static void main(String[] args) {
        User userNumberOne = new User("Iryna", "Perkhun", 18, "iryna.perkhun@gmail.com");
        User userNumberTwo = new User ("Dasha", "Dub", 19, "dub.dasha@gmail.com");

        System.out.println("userNumberTwo " + userNumberTwo.hashCode());
        System.out.println("userNumberOne hashcode " + userNumberOne.hashCode());
        System.out.println("result equals: " + userNumberOne.equals(userNumberTwo));
    }
}
