package Ca2;

import java.util.Scanner;

public class Nguoi {
    public static Scanner scanner = new Scanner(System.in);
    protected String name, gioiTinh;
    protected int ngaySinh;

    public Nguoi() {
    }

    public Nguoi(String name, String gioiTinh, int ngaySinh) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        name = scanner.nextLine();
        System.out.print("Nhap gioi tinh:");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhap ngay sinh:");
        ngaySinh = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh;
    }

}
