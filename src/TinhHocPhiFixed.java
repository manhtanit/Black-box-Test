import java.util.Scanner;

public class TinhHocPhiFixed {

    public String hocPhi(String he, int soTc) {
        if (soTc > 30 || soTc < 10) {
            return "Invalid";
        } if (he.equals("CLC")) {
            return Integer.toString(15000000);
        } else if (he.equals("chuan")){
            return Integer.toString(315000 * soTc);
        } else {
            return "Invalid";
        }

    }
}
