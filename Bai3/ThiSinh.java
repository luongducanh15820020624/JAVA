package Bai3;

import java.util.Scanner;

public class ThiSinh {
    public static Scanner scanner = new Scanner(System.in);
    protected int SBD;
    protected String hoTen, diaChi;
    protected int mucUT;

    public ThiSinh() {
    }

    public ThiSinh(int SBD, String hoTen, String diaChi, int mucUT) {
        this.SBD = SBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUT = mucUT;
    }

    public int getSBD() {
        return SBD;
    }

    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUT() {
        return mucUT;
    }

    public void setMucUT(int mucUT) {
        this.mucUT = mucUT;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi:");
        diaChi = scanner.nextLine();
        System.out.print("Nhap muc uu tien:");
        mucUT = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "SBD=" + SBD +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUT=" + mucUT;
    }
}
