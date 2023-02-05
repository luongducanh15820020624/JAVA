package Bai2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ManagerTaiLieu managerTaiLieu = new ManagerTaiLieu();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Add 1 tai lieu vào List tương ứng");
            System.out.println("Enter 2: Hiển thị danh sách các tai lieu");
            System.out.println("Enter 3: Tim kiem theo loai ");
            System.out.println("Enter 4: Xoa tai lieu theo ma tai lieu");
            System.out.println("Enter 5: Thoat:");
            System.out.print("Nhap lua chon cua ban:");
            String line1 = scanner.nextLine();
            switch (line1) {
                case "1": {
                    managerTaiLieu.addTL();
                    break;
                }
                case "2": {
                    managerTaiLieu.xuat();
                    break;
                }
                case "3": {
                    managerTaiLieu.timKiem();
                    break;
                }
                case "4": {
                    managerTaiLieu.xoa();
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
