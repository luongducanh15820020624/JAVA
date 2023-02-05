package Bai9;

import java.util.*;

public class ManagersinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<SINHVIEN> sinhViens;

    public ManagersinhVien() {
        this.sinhViens = new ArrayList<>();
    }

    public void add() {
        System.out.print("Nhap so luong sinh vien:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            SINHVIEN sinhVien = new SINHVIEN();
            int id = (sinhViens.size() > 0) ? (sinhViens.size() + 1) : 1;
            System.out.println("Ma sinh vien:" + id);
            sinhVien.setMaSV(id);
            sinhVien.nhap();
            this.sinhViens.add(sinhVien);
        }
    }

    public void xuat() {
        System.out.println("Danh sach sinh vien:");
        this.sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }

    public void min() {
        sinhViens.stream().min(Comparator.comparing(sinhvien -> sinhvien.getDiemTB()))
                .ifPresent(e -> System.out.println("Sinh vien co diem tb be nhat:\n" + e.toString()));
    }

    public void max() {
        sinhViens.stream().max(Comparator.comparing(sinhvien -> sinhvien.getDiemTB()))
                .ifPresent(e -> System.out.println("Sinh vien co diem tb lon nhat:\n" + e.toString()));
    }

    public void sort() {
        for (int i = 0; i < sinhViens.size(); i++) {
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (sinhViens.get(i).getHoTen().equals(sinhViens.get(j).getHoTen())) {
                    sinhViens.sort((o1, o2) -> Float.compare(o1.getDiemLT(), o2.getDiemLT()));
                } else {
                    sinhViens.sort((o1, o2) -> CharSequence.compare(o1.getHoTen(), o2.getHoTen()));
                }
            }
        }
        System.out.println("Danh sach sinh vien sap xep tang dan:");
        sinhViens.forEach(sinhvien -> System.out.println(sinhvien.toString()));
    }

}

