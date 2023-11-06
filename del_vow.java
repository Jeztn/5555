public class RemoveVowels {
    public static void main(String[] args) {
        String sentence = "This is a test sentence without vowels.";
        String result = sentence.replaceAll("[AEIOUaeiou]", "");

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Sentence with vowels removed: " + result);
    }
}
