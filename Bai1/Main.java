package Bai1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerCanBo managerCanBo = new ManagerCanBo();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Add 1 can bo vào List tương ứng");
            System.out.println("Enter 2: Hiển thị danh sách các can bo");
            System.out.println("Enter 3: Tim kiem can bo theo ten");
            System.out.println("Enter 4: Thoat:");
            System.out.print("Nhap lua chon cua ban:");
            String line1 = scanner.nextLine();
            switch (line1) {
                case "1": {
                    managerCanBo.addCB();
                    break;
                }
                case "2": {
                    managerCanBo.xuat();
                    break;
                }
                case "3": {
                    managerCanBo.search();
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
