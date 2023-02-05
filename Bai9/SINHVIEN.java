package Bai9;
import java.util.Scanner;

public class SINHVIEN {
    public static Scanner scanner = new Scanner(System.in);
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    private float diemTB;
    public static final String Dau = "DAU";
    public static final String Tach = "TACH";

    public SINHVIEN() {
    }

    public SINHVIEN(int maSV, String hoTen, float diemLT, float diemTH, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemTB = diemTB;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public float getDiemTB() {
        diemTB = (diemLT + diemTH) / 2;
        return diemTB;
    }

    public String getKQ() {
        if (getDiemTB() >= 5) {
            return Dau;
        } else {
            return Tach;
        }
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap diem li thuyet:");
        diemLT = scanner.nextFloat();
        System.out.print("Nhap diem thuc hanh:");
        diemTH = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "SINHVIEN{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ", diemTB=" + getDiemTB() +
                ", ketQuaHT=" + getKQ() +
                '}';
    }
}
