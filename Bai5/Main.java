package Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TruongHoc truongHoc = new TruongHoc();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Them moi hoc sinh");
            System.out.println("Enter 2: Hien thi danh sách ");
            System.out.println("Enter 3: Hien thi hoc sinh co tuoi 20 ");
            System.out.println("Enter 4: Hien thi so luong hoc sinh tuoi 23 va que Ha Noi");
            System.out.println("Enter 5: Thoat");
            System.out.print("Nhap lua chon cua ban:");
            String typy = scanner.nextLine();
            switch (typy) {
                case "1": {
                    truongHoc.add();
                    break;
                }
                case "2": {
                    truongHoc.xuat();
                    break;
                }
                case "3": {
                    truongHoc.hienThiHS20T();
                    break;
                }
                case "4": {
                    truongHoc.hienThiSL();
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
