public class TextAnalyzer {
    public static void main(String[] args) {
        String text = "Your long paragraph of text goes here.";

        // Count spaces, words, characters, and lines
        int spaces = text.split("\\s+").length - 1;
        int words = text.split("\\s+").length;
        int characters = text.length();
        int lines = text.split("\n").length;

        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + characters);
        System.out.println("Number of lines: " + lines);
    }
}
