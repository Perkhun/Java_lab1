import java.util.Comparator;

public class Comparing implements Comparator <String> {
    private char symbols;
    public Comparing(final char symbols) {
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
}
