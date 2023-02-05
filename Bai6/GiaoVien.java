package Bai6;

import java.util.Scanner;

public class GiaoVien {
    public static Scanner scanner = new Scanner(System.in);
    private String id;
    private String hoten;
    private int tuoi;
    private String queQuan;
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
    private double luongThuc;

    public GiaoVien() {
    }

    public GiaoVien(String id, String hoten, int tuoi, String queQuan, double luongCung, double luongThuong, double tienPhat, double luongThuc) {
        this.id = id;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThuc = luongThuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongThuc() {
        return luongCung + luongThuong - tienPhat;
    }

    public void setLuongThuc(double luongThuc) {
        this.luongThuc = luongThuc;
    }
    public void nhap(){
        System.out.print("Nhap ho ten:");
        hoten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap que quan:");
        queQuan = scanner.nextLine();
        System.out.print("Nhap luong cung:");
        luongCung = scanner.nextDouble();
        System.out.print("Nhap luong thuong:");
        luongThuong = scanner.nextDouble();
        System.out.print("Nhap tien phat:");
        tienPhat = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "id='" + id + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                '}';
    }
}
