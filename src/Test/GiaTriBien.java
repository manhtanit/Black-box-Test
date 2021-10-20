import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class GiaTriBien {

    @Test
    void hocPhi1() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("315000", t.hocPhi("chuan", 10));

    }

    @Test
    void hocPhi2() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("3465000", t.hocPhi("chuan", 11));
    }

    @Test
    void hocPhi3() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("6300000", t.hocPhi("chuan", 20));
    }

    @Test
    void hocPhi4() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("9135000", t.hocPhi("chuan", 29));
    }

    @Test
    void hocPhi5() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("9450000", t.hocPhi("chuan", 30));
    }

    @Test
    void hocPhi6() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("15000000", t.hocPhi("CLC", 10));

    }

    @Test
    void hocPhi7() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("15000000", t.hocPhi("CLC", 11));
    }

    @Test
    void hocPhi8() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("15000000", t.hocPhi("CLC", 20));
    }

    @Test
    void hocPhi9() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("15000000", t.hocPhi("CLC", 29));
    }

    @Test
    void hocPhi10() {
        TinhHocPhi t = new TinhHocPhi();
        assertEquals("15000000", t.hocPhi("CLC", 30));
    }

}