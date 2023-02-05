package Bai7;

import java.util.*;

public class ManagerTheMuon {
    public static Scanner scanner = new Scanner(System.in);
    private List<TheMuon> theMuons;

    public ManagerTheMuon() {
        this.theMuons = new ArrayList<>();
    }

    public void add() {
        TheMuon theMuon = new TheMuon();
        theMuon.nhap();
        this.theMuons.add(theMuon);
    }

    public void xuat() {
        System.out.println("Danh sach sinh vien:");
        this.theMuons.forEach(theMuon -> System.out.println(theMuon.toString()));
    }

    public boolean checkXoa(String maPM) {
        TheMuon TM = theMuons.stream().filter(theMuon -> theMuon
                .getMaPM().equals(maPM)).findFirst().orElse(null);
        if (TM == null) {
            return false;
        } else {
            this.theMuons.remove(TM);
            return true;
        }
    }

    public void xoa() {
        System.out.print("Nhap ma phieu muon:");
        String maPM = scanner.nextLine();
        System.out.println(checkXoa(maPM) ? "Xoa thanh cong!" : "That bai, ma phieu khong ton tai!");
    }

    public TheMuon checkHT(String hoTen) {
        return theMuons.stream().filter(theMuon -> theMuon.getSinhVien()
                .getHoTen().equals(hoTen)).findFirst().orElse(null);
    }

    public void edit() {
        System.out.print("Nhap ho ten sinh vien can sua:");
        String hoTen = scanner.nextLine();
        if (checkHT(hoTen) == null) {
            System.out.println("Khong ton tai sinh vien!");
        } else {
            for (int i = 0; i < theMuons.size(); i++) {
                if (theMuons.get(i).getSinhVien().getHoTen().equals(hoTen)) {
                    theMuons.get(i).nhap();
                    System.out.println("Sua thanh cong!");
                }
            }
        }
    }

    public void min() {
        theMuons.stream().min(Comparator.comparing(theMuon -> theMuon.getSinhVien().getTuoi()))
                .ifPresent(e -> System.out.println("Sinh vien co tuoi be nhat:: " + e.toString()));
    }
}
