package Bai3;

public class KhoiA extends ThiSinh {
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";

    public KhoiA() {
    }

    public KhoiA(int SBD, String hoTen, String diaChi, int mucUT) {
        super(SBD, hoTen, diaChi, mucUT);
    }

    @Override
    public String toString() {
        return "KhoiA{" + super.toString() + ", Mon Hoc: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA + "}";
    }
}
