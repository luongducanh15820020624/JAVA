package Bai1;

import java.util.Scanner;

public class CanBo {
    public static Scanner scanner = new Scanner(System.in);
    protected String hoTen, gioiTinh, diaChi;
    protected int tuoi;

    public CanBo() {
    }

    public CanBo(String hoTen, String gioiTinh, String diaChi, int tuoi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh:");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhap dia chi:");
        diaChi = scanner.nextLine();
        ;
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi + ", ";
    }
}
