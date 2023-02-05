package Bai3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ManagerThiSinh managerThiSinh = new ManagerThiSinh();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Them moi thi sinh theo khoi thi");
            System.out.println("Enter 2: Hiển thị danh sách các thi sinh");
            System.out.println("Enter 3: Tim kiem theo SBD ");
            System.out.println("Enter 4: Thoat:");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerThiSinh.addTS();
                    break;
                }
                case "2": {
                    managerThiSinh.xuat();
                    break;
                }
                case "3": {
                    managerThiSinh.search();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Nhap sai!");
                    continue;
            }
        }
    }
}

