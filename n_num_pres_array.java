import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n (number of elements in the array)
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Input elements into the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number to search
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Search and count the number of occurrences
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }

        // Display the result
        if (count > 0) {
            System.out.println(target + " is present in the array " + count + " times.");
        } else {
            System.out.println(target + " is not found in the array.");
        }

        scanner.close();
    }
}
