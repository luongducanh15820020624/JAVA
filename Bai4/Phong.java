package Bai4;

public class Phong {
    protected String loaiP;
    protected int giaP;

    public Phong() {
    }

    public Phong(String loaiP, int giaP) {
        this.loaiP = loaiP;
        this.giaP = giaP;
    }

    public String getLoaiP() {
        return loaiP;
    }

    public void setLoaiP(String loaiP) {
        this.loaiP = loaiP;
    }

    public int getGiaP() {
        return giaP;
    }

    public void setGiaP(int giaP) {
        this.giaP = giaP;
    }

    @Override
    public String toString() {
        return "loaiP='" + loaiP + '\'' +
                ", giaP=" + giaP ;
    }
}
