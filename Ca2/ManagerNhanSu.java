package Ca2;

import java.util.*;

public class ManagerNhanSu {
    public static Scanner scanner = new Scanner(System.in);
    private List<NhanSu> nhanSus;

    public ManagerNhanSu() {
        this.nhanSus = new ArrayList<>();
    }

    public void addNhanSu() {
        NhanSu nhanSu = new NhanSu();
        String maNV;
        do {
            System.out.print("Nhap MaNV: ");
            maNV = scanner.nextLine();
            if (check(maNV) != null) {
                System.out.println("Ma NV da ton tai, nhap lai di!");
            }
        }
        while (check(maNV) != null);
        nhanSu.setMaNV(maNV);
        nhanSu.nhap();
        this.nhanSus.add(nhanSu);
    }

    public void xuat() {
        System.out.println("Danh sach nhan vien:");
        this.nhanSus.forEach(nhanSu -> System.out.println(nhanSu.toString()));
    }

    public NhanSu check(String maNV) {
        return this.nhanSus.stream().filter(nhanSu -> nhanSu.getMaNV().equals(maNV)).findFirst().orElse(null);
    }

    public void search() {
        System.out.print("Nhap Ma NV can tim: ");
        String maNV = scanner.nextLine();
        if (check(maNV) == null) {
            System.out.println("Khong co nhan vien ban can tim!");
        } else {
            System.out.println("Nhan vien ban can tim:");
            System.out.println(check(maNV).toString());
        }
    }

    public boolean checkDelete(String maNV) {
        NhanSu NS = this.nhanSus.stream().filter(nhanSu -> nhanSu.getMaNV().equals(maNV)).findFirst().orElse(null);
        if (NS == null) {
            return false;
        } else {
            this.nhanSus.remove(NS);
            return true;
        }
    }

    public void xoa() {
        System.out.print("Enter Ma NV can xoa: ");
        String maNV = scanner.nextLine();
        System.out.println(checkDelete(maNV) ? "Xoa Thanh Cong!" : "That bai, khong co maNV ban muon xoa!");
    }

    public void sortbyNgaySinh() {
        System.out.println("Danh sach sinh vien sap xep tang dan theo ngay sinh:");
        nhanSus.sort((o1, o2) -> Double.compare(o1.getNgaySinh(), o2.getNgaySinh()));
        nhanSus.forEach(nhanSu -> System.out.println(nhanSu.toString()));
    }
}

