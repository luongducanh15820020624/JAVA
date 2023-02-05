package Ca2;

import java.util.Scanner;

public class BacLuong {
    public static Scanner scanner = new Scanner(System.in);
    private int bacluong;

    public BacLuong() {
    }

    public BacLuong(int bacluong) {
        this.bacluong = bacluong;
    }

    public int getBacluong() {
        return bacluong;
    }

    public void setBacluong(int bacluong) {
        this.bacluong = bacluong;
    }

    public void nhap() {
        System.out.print("Nhap bac luong:");
        bacluong = scanner.nextInt();
    }

    @Override
    public String toString() {
        return " BacLuong=" + bacluong;
    }
}
