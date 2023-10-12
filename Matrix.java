public class zad5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumOfDiagonals = sumDiagonals(matrix);
        int sumOfDiagonalsWithoutCenter = sumDiagonalsWithoutCenter(matrix);

        System.out.println("Sum of diagonals: " + sumOfDiagonals);
        System.out.println("Sum of diagonals without the center element: " + sumOfDiagonalsWithoutCenter);

    }


    public static int sumDiagonals(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
    public static int sumDiagonalsWithoutCenter(int[][] matrix) {
        int sum = 0;
        int center = matrix.length / 2;
        int centerIndex=  matrix[0].length / 2;


        for (int i = 0; i < matrix.length; i++) {
            if (i != center) {
                sum += matrix[i][i];
                sum += matrix[i][matrix.length - 1 - i];
            } else {
                sum += matrix[i][i];


            }
        }
        return sum;
    }

}

