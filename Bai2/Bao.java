package Bai2;

public class Bao extends TaiLieu {
    private int ngayPH;

    public Bao() {
    }

    public Bao(int maTL, String tenNSX, int soBPH, int ngayPH) {
        super(maTL, tenNSX, soBPH);
        this.ngayPH = ngayPH;
    }

    public int getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap ngay phat hanh:");
        ngayPH = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString() + " " +
                "ngayPH=" + ngayPH + '}';
    }
}
