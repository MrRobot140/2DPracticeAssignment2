public class PrintEvenIndices {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 2, 5, 8, 1, 6};

        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}