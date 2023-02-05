package Ca1;

import java.util.*;

public class ManagerSinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<SinhVien> sinhViens;

    public ManagerSinhVien() {
        this.sinhViens = new ArrayList<>();
    }

    public void addSinhVien() {
        System.out.print("Nhap so luong sinh vien:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            SinhVien sinhVien = new SinhVien();
            int id = (sinhViens.size() > 0) ? (sinhViens.size() + 1) : 1;
            System.out.println("Ma sinh vien:" + id);
            sinhVien.setId(id);
            sinhVien.nhap();
            this.sinhViens.add(sinhVien);
        }
    }

    public void xuat() {
        System.out.println("Danh sach sinh vien:");
        this.sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }


    public SinhVien checkTimKiem(int id) {
        return this.sinhViens.stream().filter(sinhVien -> sinhVien.getId() == id).findFirst().orElse(null);
    }

    public void search() {
        System.out.print("Nhap id can tim:");
        int id = scanner.nextInt();
        if (checkTimKiem(id) == null) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Danh sach sinh vien :");
            System.out.println(checkTimKiem(id).toString());
        }
    }

}

