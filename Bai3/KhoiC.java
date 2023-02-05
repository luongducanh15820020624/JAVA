package Bai3;

public class KhoiC extends ThiSinh {
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public KhoiC() {
    }

    public KhoiC(int SBD, String hoTen, String diaChi, int mucUT) {
        super(SBD, hoTen, diaChi, mucUT);
    }

    @Override
    public String toString() {
        return "KhoiC{" + super.toString() + ", Mon Hoc: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA + "}";
    }
}
