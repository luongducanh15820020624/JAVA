package Bai7;

import java.util.Scanner;

public class SinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private int tuoi;
    private String lopHoc;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int tuoi, String lopHoc) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lopHoc = lopHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap lop ");
        lopHoc = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", lopHoc='" + lopHoc + '\'' + ", ";
    }
}
