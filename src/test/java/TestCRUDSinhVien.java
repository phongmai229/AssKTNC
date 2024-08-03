import com.example.Ass2.SinhVien;
import com.example.Ass2.Sinhvienpoly;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCRUDSinhVien {
    Sinhvienpoly sinhvienpoly = new Sinhvienpoly();

    //Test thêm
    @Test
    public void testCase1ID() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID", "Phong", "SD123", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase2ID() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phong", "SD123", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu + 1, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase3ID() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID12", "Phong", "SD123", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu + 1, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase4HoTen() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "PH", "SD123", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase5HoTen() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Pho", "SD123", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu + 1, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase6HoTen() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phon", "SD123", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu + 1, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase7MaLop() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phong", "SD", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase8MaLop() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phong", "SD1", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu + 1, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase9MaLop() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phong", "SD12", "JAVA4", "PH123");
        assertEquals(soLuongPhanTu + 1, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase10TenLop() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phong", "SD12", "JA", "PH123");
        assertEquals(soLuongPhanTu, sinhvienpoly.getListSinhVien().size());
    }

    @Test
    public void testCase11KiemTraTenLopChuaKyTuDaCBiet() {
        int soLuongPhanTu = sinhvienpoly.getListSinhVien().size();
        sinhvienpoly.add("ID1", "Phong", "SD12", "JAVA4%", "PH123");
        assertEquals(soLuongPhanTu, sinhvienpoly.getListSinhVien().size());
    }
//Test search
    @Test
    public void testCase1(){
        assertEquals(false,sinhvienpoly.searchMaSV("P"));
    }
    @Test
    public void testCase2(){
        assertEquals(false,sinhvienpoly.searchMaSV("PH1234"));
    }
    @Test
    public void testCase3(){
        assertEquals(false,sinhvienpoly.searchMaSV("PH1234567894234fdsa"));
    }
    @Test
    public void testCase4NhapMaSVKhongTonTai(){
        assertEquals(false,sinhvienpoly.searchMaSV("PH777"));
    }
    @Test
    public void testCase5NhapMaSVTonTai(){
        assertEquals(true,sinhvienpoly.searchMaSV("PH222"));
    }

}
