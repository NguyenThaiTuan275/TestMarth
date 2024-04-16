import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSumOfEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expectedSum = 6; // 2 + 4 = 6
        int sum = Main.calculateSumOfEvenNumbers(numbers);
        assertEquals(expectedSum, sum, "Sum of even numbers should be 6");
    }

    @Test
    public void testSumOfEmptyArray() {
        int[] numbers = {};
        int expectedSum = 0;
        int sum = Main.calculateSumOfEvenNumbers(numbers);
        assertEquals(expectedSum, sum, "Sum of an empty array should be 0");
    }

    @Test
    public void testSumOfOddNumbers() {
        int[] numbers = {1, 3, 5};
        int expectedSum = 0; // No even numbers
        int sum = Main.calculateSumOfEvenNumbers(numbers);
        assertEquals(expectedSum, sum, "Sum of odd numbers should be 0");
    }
}
