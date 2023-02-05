package Bai8;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerBienLai managerBienLai = new ManagerBienLai();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Them moi khach hang ");
            System.out.println("Enter 2: Hien thi danh sách ");
            System.out.println("Enter 3: Sua thong tin khach hang theo ho ten");
            System.out.println("Enter 4: Xoa khach hang theo ho ten");
            System.out.println("Enter 5: Tinh tien dien phai tra");
            System.out.println("Enter 6: Thoat");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerBienLai.add();
                    break;
                }
                case "2": {
                    managerBienLai.xuat();
                    break;
                }
                case "3": {
                    managerBienLai.edit();
                    break;
                }
                case "4": {
                    managerBienLai.xoa();
                    break;
                }
                case "5": {
                    managerBienLai.money();
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
