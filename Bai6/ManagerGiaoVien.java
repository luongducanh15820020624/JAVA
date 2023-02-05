package Bai6;

import java.util.*;

public class ManagerGiaoVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<GiaoVien> giaoViens;

    public ManagerGiaoVien() {
        this.giaoViens = new ArrayList<>();
    }

    public void add() {
        GiaoVien giaoVien = new GiaoVien();
        String id;
        do {
            System.out.print("Nhap id: ");
            id = scanner.nextLine();
            if (check(id) == null) {
            } else {
                System.out.println("Id da ton tai, nhap lai di!");
            }
        }
        while (check(id) != null);
        giaoVien.setId(id);
        giaoVien.nhap();
        this.giaoViens.add(giaoVien);
    }

    public void xuat() {
        this.giaoViens.forEach(giaoVien -> System.out.println(giaoVien.toString()));
    }

    public GiaoVien check(String id) {
        return this.giaoViens.stream().filter(giaoVien -> giaoVien.getId().equals(id)).findFirst().orElse(null);
    }

    public double tinhLT(String id) {
        GiaoVien GV = this.giaoViens.stream().filter(giaoVien -> giaoVien.getId().equals(id)).findFirst().orElse(null);
        if (GV == null) {
            System.out.println("Id khong ton tai!");
            return 0;
        } else {
            return GV.getLuongThuc();
        }
    }

    public void hienThiLT() {
        System.out.print("Nhap ID de tinh luong:");
        String id = scanner.nextLine();
        System.out.println("Luong thuc: " + tinhLT(id));
    }

    public boolean checkXoa(String id) {
        GiaoVien GV = this.giaoViens.stream().filter(giaoVien -> giaoVien.getId().equals(id)).findFirst().orElse(null);
        if (GV == null) {
            return false;
        }
        this.giaoViens.remove(GV);
        return true;
    }

    public void xoa() {
        System.out.print("Nhap ID muon xoa:");
        String id = scanner.nextLine();
        System.out.println(checkXoa(id) ? "Xoa thanh cong!" : "That bai, id khong ton tai!");
    }
}
