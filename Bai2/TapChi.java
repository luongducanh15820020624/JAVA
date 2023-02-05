package Bai2;

public class TapChi extends TaiLieu {
    private int soPH;
    private int thangPH;

    public TapChi() {
    }

    public TapChi(int maTL, String tenNSX, int soBPH, int soPH, int thangPH) {
        super(maTL, tenNSX, soBPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap so phat hanh:");
        soPH = scanner.nextInt();
        System.out.print("Nhap thang phat hanh:");
        thangPH = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "TapChi{" + super.toString() + " " +
                "soPH=" + soPH +
                ", thangPH=" + thangPH + '}';
    }
}
