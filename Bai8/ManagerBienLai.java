package Bai8;

import java.util.*;

public class ManagerBienLai {
    public static Scanner scanner = new Scanner(System.in);
    private List<BienLai> bienLais;

    public ManagerBienLai() {
        this.bienLais = new ArrayList<>();
    }

    public void add() {
        BienLai bienLai = new BienLai();
        bienLai.nhap();
        this.bienLais.add(bienLai);
    }

    public void xuat() {
        this.bienLais.forEach(bienLai -> System.out.println(bienLai.toString()));
    }

    public BienLai checkHT(String hoTen) {
        return bienLais.stream().filter(bienLai -> bienLai.getKhachHang().getHoTen().equals(hoTen)).findFirst().orElse(null);
    }

    public void edit() {
        System.out.print("Nhap ho ten khach hang can sua:");
        String hoTen = scanner.nextLine();
        if (checkHT(hoTen) == null) {
            System.out.println("Khong ton tai khach hang!");
        } else {
            for (int i = 0; i < bienLais.size(); i++) {
                if (bienLais.get(i).getKhachHang().getHoTen().equals(hoTen)) {
                    bienLais.get(i).getKhachHang().nhap();
                    System.out.println("Sua thanh cong!");
                }
            }
        }
    }

    public boolean checkXoa(String hoTen) {
        BienLai BL = bienLais.stream().filter(bienLai -> bienLai
                .getKhachHang().getHoTen().equals(hoTen)).findFirst().orElse(null);
        if (BL == null) {
            return false;
        } else {
            this.bienLais.remove(BL);
            return true;
        }
    }

    public void xoa() {
        System.out.print("Nhap ho ten can xoa:");
        String maPM = scanner.nextLine();
        System.out.println(checkXoa(maPM) ? "Xoa thanh cong!" : "That bai, khach hang khong ton tai!");
    }

    public double checkTD(String hoTen) {
        BienLai BL = this.bienLais.stream().filter(bienLai -> bienLai.getKhachHang().getHoTen().equals(hoTen)).findFirst().orElse(null);
        if (BL == null) {
            System.out.println("Khong ton tai khach hang!");
            return 0;
        }
        return BL.getSoTPT();
    }

    public void money() {
        System.out.print("Nhap ho ten khach hang de tinh tien dien: ");
        String hoTen = scanner.nextLine();
        System.out.println("Tien dien: " + checkTD(hoTen));
    }
}
