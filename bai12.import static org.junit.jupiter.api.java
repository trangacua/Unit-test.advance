import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import java.time.DateTimeException;

public class Advance6Test {

    private final Advance6 advance6 = new Advance6();

    @Test
    public void testTinhTuoiValid() {
    
        int expectedAge = java.time.Period.between(
            java.time.LocalDate.of(1999, 1, 12), 
            java.time.LocalDate.now()
        ).getYears();
        
        assertEquals(expectedAge, advance6.tinhTuoi(12, 1, 1999));
    }

    @Test
    public void testTinhTuoiWithFutureDate() {
      
        assertEquals(-1, advance6.tinhTuoi(12, 1, 2030));
    }

    // 3. Test Function tinhtuoi with expectation number = -1 , actual number = (-12, 1, 2030)
    @Test
    public void testTinhTuoiWithInvalidDay() {
       
        try {
            int result = advance6.tinhTuoi(-12, 1, 2030);
            assertEquals(-1, result);
        } catch (DateTimeException e) {
            fail("Hàm gốc ném DateTimeException thay vì trả về -1 như mong đợi");
        }
    }

    // 4. Test Function tinhtuoi with expectation number = -1 , actual number = (12, -1, 2030)
    @Test
    public void testTinhTuoiWithInvalidMonth() {
        try {
            int result = advance6.tinhTuoi(12, -1, 2030);
            assertEquals(-1, result);
        } catch (DateTimeException e) {
            fail("Hàm gốc ném DateTimeException thay vì trả về -1 như mong đợi");
        }
    }

    // 5. Test Function tinhtuoi with expectation number = -1 , actual number = (12, 1, -2030)
    @Test
    public void testTinhTuoiWithNegativeYear() {
        assertEquals(-1, advance6.tinhTuoi(12, 1, -2030));
    }
}