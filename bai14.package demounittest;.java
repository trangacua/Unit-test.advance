package demounittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArraySumTest {

    // 1. Test with expectation number = 15; actual number with sum1 = {1, 2, 3, 4, 5};
    @Test
    public void testCalculateSum_positiveNumbers() {
        int[] sum1 = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = ArraySum.calculateSum(sum1);
        assertEquals(expectedSum, actualSum, "Test với mảng số dương");
    }

    // 2. Test with expectation number = 0; actual number with sum2 = {-1, 0, 1};
    @Test
    public void testCalculateSum_mixedNumbers() {
        int[] sum2 = {-1, 0, 1};
        int expectedSum = 0;
        int actualSum = ArraySum.calculateSum(sum2);
        assertEquals(expectedSum, actualSum, "Test với mảng có cả số âm, số 0 và số dương");
    }

    // 3. Test with expectation number = 150; actual number with sum3 = {10, 20, 30, 40, 50};
    @Test
    public void testCalculateSum_largePositiveNumbers() {
        int[] sum3 = {10, 20, 30, 40, 50};
        int expectedSum = 150;
        int actualSum = ArraySum.calculateSum(sum3);
        assertEquals(expectedSum, actualSum, "Test với mảng các số tròn chục lớn");
    }
}