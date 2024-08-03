import com.example.Ass2.TinhTich2SoNguyenService;
import com.example.Ass2.TinhTong2SoNguyenService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhTich2SoNguyen {
    TinhTich2SoNguyenService tinhTich2SoNguyenService = new TinhTich2SoNguyenService();
    @Test
    public void testCase1(){
        assertEquals(-1,tinhTich2SoNguyenService.tinhTich("-1","1"));
    }
    @Test
    public void testCase2(){
        assertEquals(0,tinhTich2SoNguyenService.tinhTich("0","1"));
    }
    @Test
    public void testCase3(){
        assertEquals(1,tinhTich2SoNguyenService.tinhTich("1","1"));
    }
    @Test
    public void testCase4(){
        assertEquals(9,tinhTich2SoNguyenService.tinhTich("9","1"));
    }
    @Test
    public void testCase5(){
        assertEquals(10,tinhTich2SoNguyenService.tinhTich("10","1"));
    }
    @Test
    public void testCase6(){
        assertEquals(22,tinhTich2SoNguyenService.tinhTich("11","2"));
    }
    @Test
    public void testCase7(){
        assertEquals(-11,tinhTich2SoNguyenService.tinhTich("11","-1"));
    }
    @Test
    public void testCase8(){
        assertEquals(0,tinhTich2SoNguyenService.tinhTich("11","0"));
    }
    @Test
    public void testCase9(){
        assertEquals(11,tinhTich2SoNguyenService.tinhTich("11","1"));
    }
    @Test
    public void testCase10(){
        assertEquals(99,tinhTich2SoNguyenService.tinhTich("11","9"));
    }
    @Test
    public void testCaseNhapVaoSoThuNhatLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
             tinhTich2SoNguyenService.tinhTich("9.5", "2");
        });
    }
    @Test
    public void testCaseNhapVaoSoThuHaiLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            tinhTich2SoNguyenService.tinhTich("2", "8.5");
        });
    }
}
