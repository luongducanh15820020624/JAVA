package Bai1;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String gioiTinh, String diaChi, int tuoi, int bac) {
        super(hoTen, gioiTinh, diaChi, tuoi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap bac cong nhan:");
        bac = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() + " " +
                "bac=" + bac +
                '}';
    }
}
