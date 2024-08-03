import com.example.Ass2.TinhTrungBinhCongService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


public class TestTinhTrungBinhCong {
    TinhTrungBinhCongService trungBinhCongService = new TinhTrungBinhCongService();
        @Test
        public void testCaseMangRong(){
            double[] mang= {};
            assertThrows(ArithmeticException.class,() -> {trungBinhCongService.trungBinhCong(mang);});
        }
        @Test
        public void testCaseMangNull(){
            double[] mang= null;
            assertThrows(ArithmeticException.class,() -> {trungBinhCongService.trungBinhCong(mang);});
        }
        @Test
        public void testCase2(){
            double[] mang= {1,2,3,0};
           assertEquals(1.5,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase3(){
            double[] mang= {1,2,3};
            assertEquals(2,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase4(){
            double[] mang= {1,2,3,2};
            assertEquals(2,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase5(){
            double[] mang= {1,2,3,2,2};
            assertEquals(2,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase6(){
            double[] mang= {1,2,3,2,2,8};
            assertEquals(3,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase7(){
            double[] mang= {1};
            assertEquals(1,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase8(){
            double[] mang= {1,3};
            assertEquals(2,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase9(){
            double[] mang= {1,3,2};
            assertEquals(2,trungBinhCongService.trungBinhCong(mang));
        }
        @Test
        public void testCase10(){
            double[] mang= {1,3,5,6,0};
            assertEquals(3,trungBinhCongService.trungBinhCong(mang));
        }
}
