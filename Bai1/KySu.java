package Bai1;

public class KySu extends CanBo {
    private String nghanhDT;

    public KySu() {
    }

    public KySu(String hoTen, String gioiTinh, String diaChi, int tuoi, String nghanhDT) {
        super(hoTen, gioiTinh, diaChi, tuoi);
        this.nghanhDT = nghanhDT;
    }


    public String getNghanhDT() {
        return nghanhDT;
    }

    public void setNghanhDT(String nghanhDT) {
        this.nghanhDT = nghanhDT;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap nganh dao tao:");
        nghanhDT = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() + ' ' +
                "nghanhDT='" + nghanhDT + '\'' +
                '}';
    }
}
