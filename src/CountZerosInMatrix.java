public class CountZerosInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 3},
                {4, 0, 6},
                {0, 8, 0}
        };

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Zeros: " + count);
    }
}