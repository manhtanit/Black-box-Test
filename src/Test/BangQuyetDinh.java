import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BangQuyetDinh {
    @Test
    void hocPhi1() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("Invalid", t.hocPhi("chuan", 50));

    }

    @Test
    void hocPhi2() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("6300000", t.hocPhi("chuan", 20));
    }

    @Test
    void hocPhi3() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("15000000", t.hocPhi("CLC", 20));
    }

    @Test
    void hocPhi4() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("Invalid", t.hocPhi("CNC", 29));
    }

}
