import com.example.Ass2.TinhTong2SoNguyenService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTinhTong2SoNguyen {
    TinhTong2SoNguyenService tinhTong2SoNguyenService = new TinhTong2SoNguyenService();
    @Test
    public void testCase1(){
        assertEquals(0,tinhTong2SoNguyenService.tinhTong("-1","1"));
    }
    @Test
    public void testCase2(){
        assertEquals(1,tinhTong2SoNguyenService.tinhTong("0","1"));
    }
    @Test
    public void testCase3(){
        assertEquals(2,tinhTong2SoNguyenService.tinhTong("1","1"));
    }
    @Test
    public void testCase4(){
        assertEquals(10,tinhTong2SoNguyenService.tinhTong("9","1"));
    }
    @Test
    public void testCase5(){
        assertEquals(11,tinhTong2SoNguyenService.tinhTong("10","1"));
    }
    @Test
    public void testCase6(){
        assertEquals(12,tinhTong2SoNguyenService.tinhTong("11","1"));
    }
    @Test
    public void testCase7(){
        assertEquals(10,tinhTong2SoNguyenService.tinhTong("11","-1"));
    }
    @Test
    public void testCase8(){
        assertEquals(11,tinhTong2SoNguyenService.tinhTong("11","0"));
    }
    @Test
    public void testCase9(){
        assertEquals(12,tinhTong2SoNguyenService.tinhTong("11","1"));
    }
    @Test
    public void testCase10(){
        assertEquals(20,tinhTong2SoNguyenService.tinhTong("11","9"));
    }
    @Test
    public void testCaseNhapVaoSoThuNhatLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
             tinhTong2SoNguyenService.tinhTong("9.5", "2");
        });
    }
    @Test
    public void testCaseNhapVaoSoThuHaiLaSoThapPhan(){
        assertThrows(NumberFormatException.class, () -> {
            tinhTong2SoNguyenService.tinhTong("2", "8.5");
        });
    }
}
