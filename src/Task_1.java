import java.util.Arrays;
import  java.lang.String;
import java.util.Comparator;


public class Task_1 implements Comparator<String> {
    private char symbols;
    public Task_1(final char symbols) {
        this.symbols = symbols;
    }

    public char getSymbols() {
        return symbols;
    }

    public void setSymbols(final char symbols) {
        this.symbols = symbols;
    }

    public int compare(String stringOne, String stringTwo) {
        long s1 = stringOne.chars().filter(ss -> ss == symbols).count();
        long s2 = stringTwo.chars().filter(ss -> ss == symbols).count();
        return Long.compare(s1, s2) * -1;
    }
    private static void sort(String[] string, char symbols) {
        Arrays.sort(string, new Task_1(symbols));
    }


    public static void main(String[] args) {

        String[] words = {"java", "summer", "action", "tab", "bananas"};
        char symbol = 'a';
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


        System.out.println(System.lineSeparator() + "Сортування за кількістю символа 'а':  " + System.lineSeparator());
        sort(words, symbol);
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}



