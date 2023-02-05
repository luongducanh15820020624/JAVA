package Bai4;

import java.util.Scanner;

public class Nguoi {
    public static Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private int tuoi;
    private String CCCD;
    private int soNT;
    Phong phong = new Phong();

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String CCCD, int soNT, Phong phong) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.CCCD = CCCD;
        this.soNT = soNT;
        this.phong = phong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public int getSoNT() {
        return soNT;
    }

    public void setSoNT(int soNT) {
        this.soNT = soNT;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap CCCD:");
        CCCD = scanner.nextLine();
        System.out.print("Nhap so ngay thue:");
        soNT = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap a: Chọn thue loai phong A");
        System.out.println("Nhap b: Chọn thue loai phong B");
        System.out.println("Nhap c: Chọn thue loai phong C");
        System.out.print("Chọn loai phong muon thue:");
        String choise = scanner.nextLine();
        switch (choise) {
            case "a": {
                phong = new PhongA();
                break;
            }
            case "b": {
                phong = new PhongB();
                break;
            }
            case "c": {
                phong = new PhongC();
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", CCCD='" + CCCD + '\'' +
                ", soNT=" + soNT +", "+ phong.toString() +
                '}';
    }
}
