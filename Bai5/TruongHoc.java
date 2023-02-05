package Bai5;

import java.util.*;
import java.util.stream.Collectors;

public class TruongHoc {
    public static Scanner scanner = new Scanner(System.in);
    private List<HocSinh> hocSinhs;

    public TruongHoc() {
        this.hocSinhs = new ArrayList<>();
    }

    public void add() {
        HocSinh hocSinh = new HocSinh();
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
        hocSinh.setId(id);
        hocSinh.nhap();
        this.hocSinhs.add(hocSinh);
    }

    public void xuat() {
        System.out.println("Xuat danh sach hoc sinh:");
        this.hocSinhs.forEach(hocSinh -> System.out.println(hocSinh.toString()));
    }

    public HocSinh check(String id) {
        return this.hocSinhs.stream().filter(hocSinh -> hocSinh.getId().equals(id)).findFirst().orElse(null);
    }

    public List<HocSinh> hocSinh20T() {
        return this.hocSinhs.stream().filter(hocSinh -> hocSinh.getTuoi() == 20).collect(Collectors.toList());
    }

    public HocSinh checkT() {
        return this.hocSinhs.stream().filter(hocSinh -> hocSinh.getTuoi() == 20).findFirst().orElse(null);
    }

    public void hienThiHS20T() {
        if (checkT() == null) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Danh sach hoc sinh co tuoi = 20!");
            hocSinh20T().forEach(hocSinh -> System.out.println(hocSinh.toString()));
        }
    }

    public long demSL() {
        return this.hocSinhs.stream().filter(hocSinh -> hocSinh.getTuoi() == 23 && hocSinh.getQueQuan().equals("Ha Noi")).count();
    }

    public void hienThiSL() {
        System.out.println("So luong hoc sinh tuoi 23 va qu Ha Noi:" + demSL());
    }
}
