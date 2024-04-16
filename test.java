import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSum() {
        int num1 = 5;
        int num2 = 10;
        int expectedSum = 15;
        int actualSum = Main.sum(num1, num2);
        assertEquals(expectedSum, actualSum, "Sum is calculated incorrectly");
    }
}
