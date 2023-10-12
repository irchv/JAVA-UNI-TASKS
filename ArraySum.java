public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = findSum(array);
        System.out.println("Sum of all elements: " + sum);

        int evenSum = findEvenSum(array);
        System.out.println("Sum of even elements: " + evenSum);

        int oddSum = findOddSum(array);
        System.out.println("Sum of odd elements: " + oddSum);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int findEvenSum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                sum += element;
            }
        }
        return sum;
    }

    public static int findOddSum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            if (element % 2 != 0) {
                sum += element;
            }
        }
        return sum;
    }
}