package Ca1;

public class SinhVien extends Nguoi implements GiaoDien {
    private int id;
    private String tenTK;
    private String MK;
    private String SDT;
    private String nghanh;
    Diem diem = new Diem();

    public SinhVien() {
    }

    public SinhVien(String hoten, int tuoi, String gioiTinh, String CCCD, int id, String tenTK, String MK, String SDT, String nghanh, Diem diem) {
        super(hoten, tuoi, gioiTinh, CCCD);
        this.id = id;
        this.tenTK = tenTK;
        this.MK = MK;
        this.SDT = SDT;
        this.nghanh = nghanh;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    public double getDiem() {
        return diem.getDiemTB();
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public void nhap() {
        super.nhap();
        datTaiKhoan();
        System.out.print("Nhap sdt:");
        SDT = scanner.nextLine();
        System.out.print("Nhap nganh:");
        nghanh = scanner.nextLine();
        diem.nhap();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id + traVeTaiKhoan() +
                ", SDT='" + SDT + '\'' +
                ", nghanh='" + nghanh + '\'' + diem +
                '}';
    }

    @Override
    public void datTaiKhoan() {
        System.out.print("Nhap ten TK:");
        tenTK = scanner.nextLine();
        System.out.print("Nhap mat khau:");
        MK = scanner.nextLine();
    }

    @Override
    public String traVeTaiKhoan() {
        return ", tenTK='" + tenTK + '\'' +
                ", MK='" + MK + '\'';
    }
}
