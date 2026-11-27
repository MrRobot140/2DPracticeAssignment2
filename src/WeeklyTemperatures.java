public class WeeklyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {18, 20, 22, 19, 21, 24, 16};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        double average = (double) sum / temperatures.length;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Above average: " + count);
    }
}