import java.util.Arrays;
import  java.lang.String;

public class Task_1  {
    public static void print(String[] words) {
        for (String s: words) {
            System.out.println(s);
        }
    }
    public static void sort(String[] string, char symbols) {
        Arrays.sort(string, new StringComparator(symbols));
    }

    public static void main(String[] args) {

        String[] words = {"java", "summer", "action", "tab", "bananas"};
        char symbol = 'a';
        print(words);

        System.out.println(System.lineSeparator() + "Sort 'а':  " + System.lineSeparator());

        sort(words, symbol);
        print(words);
    }
}



