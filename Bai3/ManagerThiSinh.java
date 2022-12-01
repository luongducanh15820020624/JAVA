package Bai3;

import java.util.*;

public class ManagerThiSinh {
    public static Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> thiSinhs;

    public ManagerThiSinh() {
        this.thiSinhs = new ArrayList<>();
    }

    public void addTS() {
        System.out.println("\tEnter a: Nhap thong tin KhoiA:");
        System.out.println("\tEnter b: Nhap thong tin KhoiB");
        System.out.println("\tEnter c: Nhap thong tin KhoiC:");
        System.out.print("\tMoi ban nhap lua chon:");
        String line = scanner.nextLine();
        switch (line) {
            case "a": {
                ThiSinh khoiA = new KhoiA();
                int SBD = (thiSinhs.size() > 0) ? (thiSinhs.size() + 1) : 1;
                System.out.println("So Bao Danh: " + SBD);
                khoiA.setSBD(SBD);
                khoiA.nhap();
                this.thiSinhs.add(khoiA);
                break;
            }
            case "b": {
                ThiSinh khoiB = new KhoiB();
                int SBD = (thiSinhs.size() > 0) ? (thiSinhs.size() + 1) : 1;
                System.out.println("So Bao Danh: " + SBD);
                khoiB.setSBD(SBD);
                khoiB.nhap();
                this.thiSinhs.add(khoiB);
                break;
            }
            case "c": {
                ThiSinh khoiC = new KhoiC();
                int SBD = (thiSinhs.size() > 0) ? (thiSinhs.size() + 1) : 1;
                System.out.println("So Bao Danh: " + SBD);
                khoiC.setSBD(SBD);
                khoiC.nhap();
                this.thiSinhs.add(khoiC);
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void xuat() {
        System.out.println("Danh sach cac thi sinh:");
        this.thiSinhs.forEach(thiSinh -> System.out.println(thiSinh.toString()));
    }

    public ThiSinh checkTimKiem(int SBD) {
        return this.thiSinhs.stream().filter(thiSinh -> thiSinh.getSBD() == SBD).findFirst().orElse(null);
    }

    public void search() {
        System.out.print("Nhap SBD can tim: ");
        int SBD = scanner.nextInt();
        scanner.nextLine();
        if (checkTimKiem(SBD) == null) {
            System.out.println("Khong co thi sinh ban can tim!");
        } else {
            System.out.println("Thi sinh ban can tim:");
            System.out.println(checkTimKiem(SBD).toString());
        }
    }

}
