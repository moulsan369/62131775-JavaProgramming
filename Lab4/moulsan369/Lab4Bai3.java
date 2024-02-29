package moulsan369;

import java.util.Scanner;

class SanPham_Bai3 {
    private String tenSp;
    private double donGia;
    private double giamGia;

    
    public SanPham_Bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    
    public SanPham_Bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Giá sản phẩm: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
    }

    
    private double getThueThuNhap() {
        return donGia * 0.1;
    }
}

public class Lab4Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SanPham_Bai3 sp1 = new SanPham_Bai3("Cafe Di Linh", 80.0, 1);
		SanPham_Bai3 sp2 = new SanPham_Bai3("Cafe Đăk Nông",75.0);

        
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
	}

}
