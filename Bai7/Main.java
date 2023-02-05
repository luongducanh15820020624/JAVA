package Bai7;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerTheMuon managerTheMuon = new ManagerTheMuon();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Them moi sinh vien ");
            System.out.println("Enter 2: Hien thi danh sách ");
            System.out.println("Enter 3: Sua thong tin sinh vien theo ho ten");
            System.out.println("Enter 4: Xoa sinh vien theo ma phieu");
            System.out.println("Enter 5: Age Min");
            System.out.println("Enter 6: Thoat");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerTheMuon.add();
                    break;
                }
                case "2": {
                    managerTheMuon.xuat();
                    break;
                }
                case "3": {
                    managerTheMuon.edit();
                    break;
                }
                case "4": {
                    managerTheMuon.xoa();
                    break;
                }
                case "5": {
                    managerTheMuon.min();
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
