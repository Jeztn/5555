import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String input = "abc"; // Change this to your input string
        displayAnagrams("", input);
    }

    public static void displayAnagrams(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            displayAnagrams(newPrefix, newRemaining);
        }
    }
}
