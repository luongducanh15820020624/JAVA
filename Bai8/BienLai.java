package Bai8;

import java.util.Scanner;

public class BienLai {
    public static Scanner scanner = new Scanner(System.in);
    private double soDC;
    private double soDM;
    private double soTPT;
    KhachHang khachHang = new KhachHang();

    public BienLai() {
    }

    public BienLai(double soDC, double soDM, double soTPT, KhachHang khachHang) {
        this.soDC = soDC;
        this.soDM = soDM;
        this.soTPT = soTPT;
        this.khachHang = khachHang;
    }

    public double getSoDC() {
        return soDC;
    }

    public void setSoDC(double soDC) {
        this.soDC = soDC;
    }

    public double getSoDM() {
        return soDM;
    }

    public void setSoDM(double soDM) {
        this.soDM = soDM;
    }

    public double getSoTPT() {
        return (soDM - soDC) * 5;
    }

    public void setSoTPT(double soTPT) {
        this.soTPT = soTPT;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void nhap() {
        khachHang.nhap();
        System.out.print("Nhap so dien moi:");
        soDM = scanner.nextDouble();
        System.out.print("Nhap so dien cu:");
        soDC = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "BienLai{" + khachHang.toString() +
                "soDC=" + soDC +
                ", soDM=" + soDM +
                '}';
    }
}
