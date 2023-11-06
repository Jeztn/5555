public class ReplaceConsecutiveSpaces {
    public static void main(String[] args) {
        String input = "This   is    a     test  string";
        String result = input.replaceAll("\\s{2,}", " ");
        
        System.out.println("Original String: " + input);
        System.out.println("String with consecutive spaces replaced: " + result);
    }
}
