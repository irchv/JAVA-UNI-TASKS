import java.util.Scanner;

public class zad3{
    public static void main(String[] args) {
        findMaxAndMinValues();
    }

    public static void findMaxAndMinValues() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();


        int[] values = new int[numElements];


        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        // Find the maximum and minimum values in the array
        int max = values[0];
        int min = values[0];

        for (int i = 1; i < numElements; i++) {
            if (values[i] > max) {
                max = values[i];
            }
            if (values[i] < min) {
                min = values[i];
            }
        }

        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }
}