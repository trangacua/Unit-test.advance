import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class Advance4Test {
    private final Advance4 advance4 = new Advance4();

    @Test
    public void testIsPrimeNumberSuccess() {
        // Các số 2, 3, 5, 7, 11 là số nguyên tố -> Kết quả mong đợi là true
        assertTrue(advance4.isPrimeNumber(2));
        assertTrue(advance4.isPrimeNumber(3));
        assertTrue(advance4.isPrimeNumber(5));
        assertTrue(advance4.isPrimeNumber(7));
        assertTrue(advance4.isPrimeNumber(11));
    }
    @Test
    public void testIsPrimeNumberWithSix() {
        
        assertFalse(advance4.isPrimeNumber(6));
    }
    @Test
    public void testIsPrimeNumberWithNegativeThree() {
        assertFalse(advance4.isPrimeNumber(-3));
    }
}