package Ca2;

public class NhanSu extends Nguoi implements NgheNghiep {
    private String maNV;
    private String soCCCD;
    private String ngheNghiep;
    BacLuong bacLuong = new BacLuong();

    public NhanSu() {
    }

    public NhanSu(String name, String gioiTinh, int ngaySinh, String maNV, String soCCCD, String ngheNghiep, BacLuong bacLuong) {
        super(name, gioiTinh, ngaySinh);
        this.maNV = maNV;
        this.soCCCD = soCCCD;
        this.ngheNghiep = ngheNghiep;
        this.bacLuong = bacLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public BacLuong getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(BacLuong bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public void nhapNgheNghiep() {
        System.out.print("Nhap nghe nghiep:");
        ngheNghiep = scanner.nextLine();
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap CCCD:");
        soCCCD = scanner.nextLine();
        bacLuong.nhap();
        nhapNgheNghiep();
    }

    @Override
    public String toString() {
        return "NhanSu{" + "maNV='" + maNV + '\'' + ", " + super.toString() +
                ", soCCCD='" + soCCCD + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' + "," + bacLuong.toString() +
                '}';
    }
}
