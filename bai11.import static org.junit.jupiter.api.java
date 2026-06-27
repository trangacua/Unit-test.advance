import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Advance5Test {

    private final Advance5 advance5 = new Advance5();
    @Test
    public void testKiemTraDoiXungGeneral() {
        assertTrue(advance5.kiemTraDoiXung(12321));
        assertFalse(advance5.kiemTraDoiXung(112));
    }
    @Test
    public void testKiemTraDoiXungWith12121() {
        // Số 12121 đọc xuôi hay ngược đều là 12121 -> true
        assertTrue(advance5.kiemTraDoiXung(12121));
    }

    @Test
    public void testKiemTraDoiXungWithZero() {
        // Số 0 chỉ có một chữ số, mặc định là đối xứng -> true
        assertTrue(advance5.kiemTraDoiXung(0));
    }

    @Test
    public void testKiemTraDoiXungWithNegative102() {
        // Số -102 chuyển thành chuỗi là "-102", đảo ngược thành "201-" -> false
        assertFalse(advance5.kiemTraDoiXung(-102));
    }

    @Test
    public void testKiemTraDoiXungWithNegative101() {
        assertTrue(advance5.kiemTraDoiXung(-101));
    }
}