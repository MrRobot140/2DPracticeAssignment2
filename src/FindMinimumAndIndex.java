public class FindMinimumAndIndex {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 5, 3, 9, 2, 6};

        int min = numbers[0];
        int index = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }

        System.out.println("Min: " + min + ", index: " + index);
    }
}