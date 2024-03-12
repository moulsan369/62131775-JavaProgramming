package moulsan369;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6bai2 {
    static class SanPham_bai2l6 {
        private String tenSp;
        private double donGia;
        private String hang;

        public SanPham_bai2l6() {}
        SanPham_bai2l6(String tenSp, double donGia, String hang) {
            this.tenSp = tenSp;
            this.donGia = donGia;
            this.hang = hang;
        }

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sản phẩm: ");
            this.tenSp = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            this.donGia = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Nhập hãng sản phẩm: ");
            this.hang = scanner.nextLine();
        }

        public void xuat() {
            System.out.println("Tên sản phẩm: " + this.tenSp);
            System.out.println("Giá sản phẩm: " + this.donGia);
            System.out.println("Hãng sản phẩm: " + this.hang);
        }

        public String getHang() {
            return this.hang;
        }
    }

    public static void main(String[] args) {
        ArrayList<SanPham_bai2l6> danhSachSanPham = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
            SanPham_bai2l6 sanPham = new SanPham_bai2l6();
            sanPham.nhap();
            danhSachSanPham.add(sanPham);
        }

        System.out.println("\nCác sản phẩm của hãng Nokia:");
        for (SanPham_bai2l6 sanPham : danhSachSanPham) {
            if (sanPham.getHang().equalsIgnoreCase("Nokia")) {
                sanPham.xuat();
            }
        }
    }
}
