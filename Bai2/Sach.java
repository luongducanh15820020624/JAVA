package Bai2;

public class Sach extends TaiLieu {
    private String tenTG;
    private int soTrang;

    public Sach() {
    }

    public Sach(int maTL, String tenNSX, int soBPH, String tenTG, int soTrang) {
        super(maTL, tenNSX, soBPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap so trang:");
        soTrang = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ten tac gia:");
        tenTG = scanner.nextLine();

    }

    @Override
    public String toString() {
        return "Sach{" + super.toString() + " " +
                "tenTG='" + tenTG + '\'' +
                ", soTrang=" + soTrang + '}';
    }
}
