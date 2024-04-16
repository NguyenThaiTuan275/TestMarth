public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
