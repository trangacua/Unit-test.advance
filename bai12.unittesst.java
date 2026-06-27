import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Advance7Test {

    private final Advance7 advance7 = new Advance7();

    // 1. Test Function tinhThu (Kiểm thử chức năng tổng quát với ngày hợp lệ)
    @Test
    public void testTinhThuGeneral() {
        // Ngày 5/4/2020 là Chủ Nhật -> Calendar.DAY_OF_WEEK trả về 1
        assertEquals(1, advance7.tinhThu(5, 4, 2020));
    }

    // 2. Test Function tinhThu with expectation number = 2, actual number = (6, 4, 2020)
    @Test
    public void testTinhThuWithValidMonday() {
        // Ngày 6/4/2020 là Thứ Hai -> Calendar.DAY_OF_WEEK trả về 2
        assertEquals(2, advance7.tinhThu(6, 4, 2020));
    }

    // 3. Test Function tinhThu with expectation number = 0 , actual number = (35, 6, 2019)
    @Test
    public void testTinhThuWithInvalidDay() {
        // Ngày 35 không hợp lệ -> Mong đợi trả về 0
        assertEquals(0, advance7.tinhThu(35, 6, 2019));
    }

    // 4. Test Function tinhThu with expectation number = 0 , actual number = (19, 35, 2020)
    @Test
    public void testTinhThuWithInvalidMonth() {
        // Tháng 35 không hợp lệ -> Mong đợi trả về 0
        assertEquals(0, advance7.tinhThu(19, 35, 2020));
    }

    // 5. Test Function tinhThu with expectation number = 0 , actual number = (-19, 35, 2020)
    @Test
    public void testTinhThuWithNegativeDayAndInvalidMonth() {
        // Ngày âm và tháng sai -> Mong đợi trả về 0
        assertEquals(0, advance7.tinhThu(-19, 35, 2020));
    }

    // 6. Test Function tinhThu with expectation number = 0 , actual number = (19, -9, 2020)
    @Test
    public void testTinhThuWithNegativeMonth() {
        // Tháng âm không hợp lệ -> Mong đợi trả về 0
        assertEquals(0, advance7.tinhThu(19, -9, 2020));
    }

    // 7. Test Function tinhThu with expectation number = 0 , actual number = (19, 9, -2020)
    @Test
    public void testTinhThuWithNegativeYear() {
        // Năm âm không hợp lệ -> Mong đợi trả về 0
        assertEquals(0, advance7.tinhThu(19, 9, -2020));
    }
}