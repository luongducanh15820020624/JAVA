package Ca1;

import java.util.*;
import java.util.stream.Collectors;

public class ManagerSinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<SinhVien> sinhViens;

    public ManagerSinhVien() {
        this.sinhViens = new ArrayList<>();
    }

    public void addSinhVien() {
        SinhVien sinhVien = new SinhVien();
        int id = (sinhViens.size() > 0) ? (sinhViens.size() + 1) : 1;
        System.out.println("Ma sinh vien:" + id);
        sinhVien.nhap();
        this.sinhViens.add(sinhVien);
    }

    public void xuat() {
        this.sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }

    public List<SinhVien> timKiem() {
        return this.sinhViens.stream().filter(sinhVien -> sinhVien.diemTB() >= 5).collect(Collectors.toList());
    }

    public SinhVien checkTimKiem() {
        return this.sinhViens.stream().filter(sinhVien-> sinhVien.diemTB() >= 5).findFirst().orElse(null);
    }

    public void search() {
        if (checkTimKiem() == null) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Danh sach sinh vien co DTB >= 5:");
            timKiem().forEach(sinhVien -> System.out.println(sinhVien.toString()));
        }
    }

}

