import com.example.Ass2.TruyXuat1PhanTuMangService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class testTruyXuat1PhanTuMang {
    TruyXuat1PhanTuMangService truyXuat1PhanTuMangService = new TruyXuat1PhanTuMangService();

    @Test
    public void testcaseNhapVaoIndexKHopLe() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 123);
        });
    }

    @Test
    public void testcaseNhapVaoIndexKHopLe2() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, -6);
        });

    }

    @Test
    public void testcaseDung3() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(1, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 0));
    }

    @Test
    public void testcaseDung4() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(2, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 1));
    }

    @Test
    public void testcaseDung5() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(4, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 3));
    }

    @Test
    public void testcaseDung6() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(5, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 4));
    }

    @Test
    public void testcaseDung7() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(6, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 5));
    }

    @Test
    public void testcaseDung8() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(7, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 6));
    }

    @Test
    public void testcaseDung9() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(8, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 7));
    }

    @Test
    public void testcaseDung10() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 8);
        });
    }
}
