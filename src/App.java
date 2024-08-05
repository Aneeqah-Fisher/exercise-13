import java.util.Scanner;
import java.util.HashSet;

public class App {

    // Method to remove duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        // Use a HashSet to automatically handle duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : list) {
            set.add(num);
        }

        // Convert HashSet to an int array
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Get and display unique numbers
        int[] uniqueNumbers = eliminateDuplicates(numbers);
        System.out.print("Unique numbers: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}