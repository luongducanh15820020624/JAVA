package Ca1;

import java.util.*;

public class Nguoi {
    public static Scanner scanner = new Scanner(System.in);
    protected String hoten;
    protected int tuoi;
    protected String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoten, int tuoi, String gioiTinh) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh:");
        gioiTinh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'';
    }

}
