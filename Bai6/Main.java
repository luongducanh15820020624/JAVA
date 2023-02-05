package Bai6;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerGiaoVien managerGiaoVien = new ManagerGiaoVien();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Them moi giao vien");
            System.out.println("Enter 2: Hien thi danh sách ");
            System.out.println("Enter 3: Tinh luong thuc cua giao vien");
            System.out.println("Enter 4: Xoa giao vien theo id");
            System.out.println("Enter 5: Thoat");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerGiaoVien.add();
                    break;
                }
                case "2": {
                    managerGiaoVien.xuat();
                    break;
                }
                case "3": {
                    managerGiaoVien.hienThiLT();
                    break;
                }
                case "4": {
                    managerGiaoVien.xoa();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Nhap sai!");
                    continue;
            }
        }
    }
}
