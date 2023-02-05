package Bai3;

public class KhoiB extends ThiSinh {
    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public KhoiB() {
    }

    public KhoiB(int SBD, String hoTen, String diaChi, int mucUT) {
        super(SBD, hoTen, diaChi, mucUT);
    }

    @Override
    public String toString() {
        return "KhoiB{" + super.toString() + ", Mon Hoc: " + MON_TOAN + " - " + MON_HOA + " - " + MON_SINH + "}";
    }
}
