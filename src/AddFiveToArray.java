public class AddFiveToArray {
    public static void main(String[] args) {
        int[] numbers = {1, 4, -2, 0, 8, 3};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}