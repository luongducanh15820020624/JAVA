package Bai8;

import java.util.Scanner;

public class KhachHang {
    public static Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private int soNha;
    private String maCTD;

    public KhachHang() {
    }

    public KhachHang(String hoTen, int soNha, String maCTD) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCTD = maCTD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCTD() {
        return maCTD;
    }

    public void setMaCTD(String maCTD) {
        this.maCTD = maCTD;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap so nha:");
        soNha = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ma cong to dien:");
        maCTD = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", soNha=" + soNha +
                ", maCTD='" + maCTD + '\'' + ", ";
    }
}
