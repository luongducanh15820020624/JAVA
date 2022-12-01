package Ca2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ManagerNhanSu managerNhanSu = new ManagerNhanSu();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Add 1 nhan vien vào List tương ứng");
            System.out.println("Enter 2: Hiển thị danh sách các nhan vien");
            System.out.println("Enter 3: Tim nhan vien theo ma nhan vien");
            System.out.println("Enter 4: Xoa nhan vien theo ma nhan vien:");
            System.out.println("Enter 5: Sap Xep tang dan theo tuoi:");
            System.out.println("Enter 6: Thoat chuong trinh:");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerNhanSu.addNhanSu();
                    break;
                }
                case "2": {
                    managerNhanSu.xuat();
                    break;
                }
                case "3": {
                    managerNhanSu.search();
                    break;
                }
                case "4": {
                    managerNhanSu.xoa();
                    break;
                }
                case "5": {
                    managerNhanSu.sortbyNgaySinh();
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
