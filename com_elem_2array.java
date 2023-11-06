import java.util.HashSet;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}
