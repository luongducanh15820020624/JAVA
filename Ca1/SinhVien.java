package Ca1;

public class SinhVien extends Nguoi {
    private int id;
    Diem diem = new Diem();

    public SinhVien() {
    }

    public SinhVien(String hoten, int tuoi, String gioiTinh, int id, Diem diem) {
        super(hoten, tuoi, gioiTinh);
        this.id = id;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public Double diemTB() {
        return diem.getDiemTB();
    }

    public void nhap() {
        super.nhap();
        diem.nhap();
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString() + ", " + diem.toString() + '}';
    }

}
