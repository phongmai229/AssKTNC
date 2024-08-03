import com.example.Ass2.TinhHieu2SoNguyenService;
import com.example.Ass2.TinhTich2SoNguyenService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhHieu2SoNguyen {
    TinhHieu2SoNguyenService tinhHieu2SoNguyenService = new TinhHieu2SoNguyenService();
    @Test
    public void testCase1(){
        assertEquals(-2,tinhHieu2SoNguyenService.tinhHieu("-1","1"));
    }
    @Test
    public void testCase2(){
        assertEquals(-1,tinhHieu2SoNguyenService.tinhHieu("0","1"));
    }
    @Test
    public void testCase3(){
        assertEquals(0,tinhHieu2SoNguyenService.tinhHieu("1","1"));
    }
    @Test
    public void testCase4(){
        assertEquals(8,tinhHieu2SoNguyenService.tinhHieu("9","1"));
    }
    @Test
    public void testCase5(){
        assertEquals(9,tinhHieu2SoNguyenService.tinhHieu("10","1"));
    }
    @Test
    public void testCase6(){
        assertEquals(9,tinhHieu2SoNguyenService.tinhHieu("11","2"));
    }
    @Test
    public void testCase7(){
        assertEquals(12,tinhHieu2SoNguyenService.tinhHieu("11","-1"));
    }
    @Test
    public void testCase8(){
        assertEquals(11,tinhHieu2SoNguyenService.tinhHieu("11","0"));
    }
    @Test
    public void testCase9(){
        assertEquals(10,tinhHieu2SoNguyenService.tinhHieu("11","1"));
    }
    @Test
    public void testCase10(){
        assertEquals(2,tinhHieu2SoNguyenService.tinhHieu("11","9"));
    }
    @Test
    public void testCaseNhapVaoSoThuNhatLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
             tinhHieu2SoNguyenService.tinhHieu("9.5", "2");
        });
    }
    @Test
    public void testCaseNhapVaoSoThuHaiLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            tinhHieu2SoNguyenService.tinhHieu("2", "8.5");
        });
    }
}
