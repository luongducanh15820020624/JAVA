package Bai4;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        KhachSan khachSan = new KhachSan();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Them moi nguoi thue");
            System.out.println("Enter 2: Hiển thị danh sách ");
            System.out.println("Enter 3: Tinh tien thue ");
            System.out.println("Enter 4: Xoa khach hang theo CCCD");
            System.out.println("Enter 5: Thoat");
            System.out.print("Nhap lua chon cua ban:");
            String line1 = scanner.nextLine();
            switch (line1) {
                case "1": {
                    khachSan.add();
                    break;
                }
                case "2": {
                    khachSan.xuat();
                    break;
                }
                case "3": {
                    khachSan.Money();
                    break;
                }
                case "4": {
                    khachSan.xoa();
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
