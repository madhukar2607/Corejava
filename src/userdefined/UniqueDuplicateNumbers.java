package userdefined;
import java.util.*;

public class UniqueDuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {33, 45, 67, 89, 33, 47, 21, 45};

        // Display unique numbers
        System.out.println("Unique numbers:");
        displayUniqueNumbers(numbers);

        // Display duplicate numbers
        System.out.println("\nDuplicate numbers:");
        displayDuplicateNumbers(numbers);
    }

    public static void displayUniqueNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                System.out.print(num + " ");
            }
        }
    }

    public static void displayDuplicateNumbers(int[] numbers) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        // Count the occurrences of each number
        for (int num : numbers) {
            numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
        }

        // Display numbers with count greater than 1
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
