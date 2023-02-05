package Bai5;

import java.util.Scanner;

public class HocSinh {
    public static Scanner scanner = new Scanner(System.in);
    private String id;
    private String hoTen;
    private int tuoi;
    private String queQuan;

    public HocSinh() {
    }

    public HocSinh(String id, String hoTen, int tuoi, String queQuan) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap que quan:");
        queQuan = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
