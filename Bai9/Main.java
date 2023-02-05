package Bai9;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagersinhVien managersinhVien = new ManagersinhVien();
        while (true) {
            System.out.println("Enter 1: Nhap danh sach sinh vien:");
            System.out.println("Enter 2: Hien thi danh sach sinh vien:");
            System.out.println("Enter 3: sinh vien co diem TB max ");
            System.out.println("Enter 4: sinh vien co diem TB min ");
            System.out.println("Enter 5: sap xep tang dan theo ten ");
            System.out.println("Enter 6: Thoat!");
            System.out.print("Nhap lua chon:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managersinhVien.add();
                    break;
                }
                case "2": {
                    managersinhVien.xuat();
                    break;
                }
                case "3": {
                    managersinhVien.max();
                    break;
                }
                case "4": {
                    managersinhVien.min();
                    break;
                }
                case "5": {
                    managersinhVien.sort();
                    break;
                }
                case "6": {
                    return;
                }
                default:
                    System.out.println("Nhap sai!");
                    continue;
            }
        }
    }
}
