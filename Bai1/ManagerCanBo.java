package Bai1;

import java.util.*;
import java.util.stream.Collectors;

public class ManagerCanBo {
    public static Scanner scanner = new Scanner(System.in);
    private List<CanBo> canBos;

    public ManagerCanBo() {
        this.canBos = new ArrayList<>();
    }

    public void addCB() {
        System.out.println("\tEnter a: Nhap thong tin Cong Nhan:");
        System.out.println("\tEnter b: Nhap thong tin Ky Su:");
        System.out.println("\tEnter c: Nhap thong tin Nhan Vien:");
        System.out.print("\tMoi ban nhap lua chon:");
        String line = scanner.nextLine();
        switch (line) {
            case "a": {
                CanBo congNhan = new CongNhan();
                congNhan.nhap();
                this.canBos.add(congNhan);
                break;
            }
            case "b": {
                CanBo kySu = new KySu();
                kySu.nhap();
                this.canBos.add(kySu);
                break;
            }
            case "c": {
                CanBo nhanVien = new NhanVien();
                nhanVien.nhap();
                this.canBos.add(nhanVien);
                break;
            }
            default:
                System.out.println("Nhap sai!");
                break;
        }
    }

    public void xuat() {
        System.out.println("Danh sach can bo:");
        this.canBos.forEach(canBo -> System.out.println(canBo.toString()));
    }

    public List<CanBo> timKiem(String hoTen) {
        return this.canBos.stream().filter(canBo -> canBo.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }

    public CanBo checkTimKiem(String hoTen) {
        return this.canBos.stream().filter(canBo -> canBo.getHoTen().equals(hoTen)).findFirst().orElse(null);
    }

    public void search() {
        System.out.print("Nhap hoTen can tim: ");
        String hoTen = scanner.nextLine();
        if (checkTimKiem(hoTen) == null) {
            System.out.println("Khong co can bo ban can tim!");
        } else {
            System.out.println("Can Bo ban can tim:");
            timKiem(hoTen).forEach(canBo -> System.out.println(canBo.toString()));
        }
    }
}
