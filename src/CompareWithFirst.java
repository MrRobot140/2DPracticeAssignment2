public class CompareWithFirst {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 3, 8, 6, 10, 2, 7};
        int count = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[0]) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}