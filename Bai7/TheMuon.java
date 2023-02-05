package Bai7;

import java.util.*;

public class TheMuon {
    public static Scanner scanner = new Scanner(System.in);
    private String maPM;
    private int ngayM;
    private int ngayT;
    private int soHieuSach;
    SinhVien sinhVien = new SinhVien();

    public TheMuon() {
    }

    public TheMuon(String maPM, int ngayM, int ngayT, int soHieuSach, SinhVien sinhVien) {
        this.maPM = maPM;
        this.ngayM = ngayM;
        this.ngayT = ngayT;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public int getNgayM() {
        return ngayM;
    }

    public void setNgayM(int ngayM) {
        this.ngayM = ngayM;
    }

    public int getNgayT() {
        return ngayT;
    }

    public void setNgayT(int ngayT) {
        this.ngayT = ngayT;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void nhap() {
        sinhVien.nhap();
        System.out.print("Nhap ma phieu muon:");
        maPM = scanner.nextLine();
        System.out.print("Nhap ngay muon:");
        ngayM = scanner.nextInt();
        System.out.print("Nhap ngay tra:");
        ngayT = scanner.nextInt();
        System.out.print("Nhap so hieu sach:");
        soHieuSach = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "TheMuon{" + sinhVien.toString() +
                "maPM='" + maPM + '\'' +
                ", ngayM=" + ngayM +
                ", ngayT=" + ngayT +
                ", soHieuSach=" + soHieuSach +
                '}';
    }
}
