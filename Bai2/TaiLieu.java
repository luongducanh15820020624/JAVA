package Bai2;

import java.util.Scanner;

public class TaiLieu {
    public static Scanner scanner = new Scanner(System.in);
    protected int maTL;
    protected String tenNSX;
    protected int soBPH;

    public TaiLieu() {
    }

    public TaiLieu(int maTL, String tenNSX, int soBPH) {
        this.maTL = maTL;
        this.tenNSX = tenNSX;
        this.soBPH = soBPH;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public int getSoBPH() {
        return soBPH;
    }

    public void setSoBPH(int soBPH) {
        this.soBPH = soBPH;
    }

    public void nhap() {

        System.out.print("Nhap ten NSX:");
        tenNSX = scanner.nextLine();
        System.out.print("Nhap so ban phat hanh:");
        soBPH = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "maTL='" + maTL + '\'' +
                ", tenNSX='" + tenNSX + '\'' +
                ", soBPH=" + soBPH + ",";
    }
}
