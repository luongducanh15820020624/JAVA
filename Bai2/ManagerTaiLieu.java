package Bai2;

import java.util.Scanner;
import java.util.*;

public class ManagerTaiLieu {
    public static Scanner scanner = new Scanner(System.in);
    private List<TaiLieu> taiLieus;

    public ManagerTaiLieu() {
        this.taiLieus = new ArrayList<>();
    }

    public void addTL() {
        System.out.println("\tEnter a: Nhap thong tin sach:");
        System.out.println("\tEnter b: Nhap thong tin bao:");
        System.out.println("\tEnter c: Nhap thong tin tap chi:");
        System.out.print("\tMoi ban nhap lua chon:");
        String line = scanner.nextLine();
        switch (line) {
            case "a": {
                TaiLieu sach = new Sach();
                int maTL = (taiLieus.size() > 0) ? (taiLieus.size() + 1) : 1;
                System.out.println("Ma tai lieu: " + maTL);
                sach.setMaTL(maTL);
                sach.nhap();
                this.taiLieus.add(sach);
                break;
            }
            case "b": {
                TaiLieu bao = new Bao();
                int maTL = (taiLieus.size() > 0) ? (taiLieus.size() + 1) : 1;
                System.out.println("Ma tai lieu: " + maTL);
                bao.setMaTL(maTL);
                bao.nhap();
                this.taiLieus.add(bao);
                break;
            }
            case "c": {
                TaiLieu tapChi = new TapChi();
                int maTL = (taiLieus.size() > 0) ? (taiLieus.size() + 1) : 1;
                System.out.println("Ma tai lieu: " + maTL);
                tapChi.setMaTL(maTL);
                tapChi.nhap();
                this.taiLieus.add(tapChi);
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void xuat() {
        System.out.println("Danh sach Tai Lieu:");
        this.taiLieus.forEach(taiLieu -> System.out.println(taiLieu.toString()));
    }

    public TaiLieu checkTimKiemS() {
        return this.taiLieus.stream().filter(taiLieu -> taiLieu instanceof Sach).findFirst().orElse(null);
    }

    public TaiLieu checkTimKiemB() {
        return this.taiLieus.stream().filter(taiLieu -> taiLieu instanceof Bao).findFirst().orElse(null);
    }

    public TaiLieu checkTimKiemTC() {
        return this.taiLieus.stream().filter(taiLieu -> taiLieu instanceof TapChi).findFirst().orElse(null);
    }

    public void timKiem() {
        System.out.println("\tEnter a: Tim kiem sach");
        System.out.println("\tEnter b: Tim kiem bao");
        System.out.println("\tEnter c: Tim kiem tap chi");
        System.out.print("\tMoi ban nhap lua chon:");
        String choise = scanner.nextLine();
        switch (choise) {
            case "a": {
                if (checkTimKiemS() == null) {
                    System.out.println("Danh sach trong!");
                } else {
                    System.out.println("Danh sach cac loai tap chi:");
                    this.taiLieus.stream().filter(taiLieu -> taiLieu instanceof Sach).forEach(taiLieu -> System.out.println(taiLieu.toString()));
                }
                break;
            }
            case "b": {
                if (checkTimKiemB() == null) {
                    System.out.println("Danh sach trong!");
                } else {
                    System.out.println("Danh sach cac loai tap chi:");
                    this.taiLieus.stream().filter(taiLieu -> taiLieu instanceof Bao).forEach(taiLieu -> System.out.println(taiLieu.toString()));
                }
                break;
            }
            case "c":
                if (checkTimKiemTC() == null) {
                    System.out.println("Danh sach trong!");
                } else {
                    System.out.println("Danh sach cac loai tap chi:");
                    this.taiLieus.stream().filter(taiLieu -> taiLieu instanceof TapChi).forEach(taiLieu -> System.out.println(taiLieu.toString()));
                }
                break;
            default:
                System.out.println("Nhap sai!");
                break;
        }
    }

    public boolean checkDelete(int maTL) {
        TaiLieu TL = this.taiLieus.stream().filter(taiLieu -> taiLieu.getMaTL() == maTL).findFirst().orElse(null);
        if (TL == null) {
            return false;
        }
        this.taiLieus.remove(TL);
        return true;
    }

    public void xoa() {
        System.out.print("Nhap Ma TL can xoa: ");
        int maTL = scanner.nextInt();
        scanner.nextLine();
        System.out.println(checkDelete(maTL) ? "Xoa Thanh Cong!" : "That bai, khong co maTL ban muon xoa!");
    }
}
