import java.util.Scanner;

public class Cao_Genteroy_Gimenez_Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store power levels of 10 creatures
        int[] powerLevels = new int[10];
        System.out.println("Enter 10 power levels of creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt(); // Read power levels from user
        }

        // Bubble sort (ascending)
        int[] bubbleSorted = copyArray(powerLevels);
        sortArrayAscending(bubbleSorted);
        System.out.println("\nBubble Sort (Ascending):");
        displayArray(bubbleSorted);

        // Selection sort (descending)
        int[] selectionSorted = copyArray(powerLevels);
        sortArrayDescending(selectionSorted);
        System.out.println("\nSelection Sort (Descending):");
        displayArray(selectionSorted);

        // Analysis
        int sumEven = 0, sumOdd = 0;
        for (int level : powerLevels) {
            if (level % 2 == 0) {
                sumEven += level;
            } else {
                sumOdd += level;
            }
        }

        int minPower = findMinimum(powerLevels);
        int maxPower = findMaximum(powerLevels);

        // Display analysis results
        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power Level: " + minPower);
        System.out.println("Maximum Power Level: " + maxPower);
    }

    // Function to copy an array
    private static int[] copyArray(int[] source) {
        int[] destination = new int[source.length];
        System.arraycopy(source, 0, destination, 0, source.length);
        return destination;
    }

    // Bubble sort algorithm to sort the array in ascending order
    private static void sortArrayAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the current element is greater than the next
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort algorithm to sort the array in descending order
    private static void sortArrayDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i; // Assume the first element is the maximum
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIdx]) {
                    maxIdx = j; // Update maxIdx if a larger element is found
                }
            }
            // Swap the found maximum element with the first element
            int temp = array[maxIdx];
            array[maxIdx] = array[i];
            array[i] = temp;
        }
    }

    // Find the minimum value in the array
    private static int findMinimum(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Find the maximum value in the array
    private static int findMaximum(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Display the elements of the array
    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // New line after displaying the array
    }
}
