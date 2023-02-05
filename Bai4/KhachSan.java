package Bai4;

import java.util.*;

public class KhachSan {
    public static Scanner scanner = new Scanner(System.in);
    private List<Nguoi> nguois;

    public KhachSan() {
        this.nguois = new ArrayList<>();
    }

    public void add() {
        Nguoi nguoi = new Nguoi();
        nguoi.nhap();
        this.nguois.add(nguoi);
    }

    public void xuat() {
        System.out.println("Danh sach:");
        this.nguois.forEach(nguoi -> System.out.println(nguoi.toString()));
    }

    public int checkTP(String CCCD) {
        Nguoi nguoi = this.nguois.stream().filter(nguoi1 -> nguoi1.getCCCD().equals(CCCD)).findFirst().orElse(null);
        if (nguoi == null) {
            System.out.println("Khong ton tai CCCD!");
            return 0;
        }
        return nguoi.getSoNT() * nguoi.getPhong().getGiaP();
    }

    public void Money() {
        System.out.print("Nhap CCCD de tinh tien phong: ");
        String CCCD = scanner.nextLine();
        System.out.println("Tien Thue: " + checkTP(CCCD));
    }

    public boolean checkXoa(String CCCD) {
        Nguoi N = this.nguois.stream().filter(nguoi -> nguoi.getCCCD().equals(CCCD)).findFirst().orElse(null);
        if (N == null) {
            return false;
        }
        this.nguois.remove(N);
        return true;
    }

    public void xoa() {
        System.out.print("Nhap CCCD can xoa:");
        String CCCD = scanner.nextLine();
        System.out.println(checkXoa(CCCD) ? "Xoa thanh cong!" : "That bai, khong ton tai CCCD!");
    }

}
