package moulsan369;

import java.util.Scanner;


class SanPham_Bai2 {
    String ten;
    double gia;
    int soLuong;

    
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        ten = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        gia = scanner.nextDouble();
        System.out.print("Nhập số lượng sản phẩm: ");
        soLuong = scanner.nextInt();
    }

    
    void xuat() {
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Giá sản phẩm: " + gia);
        System.out.println("Số lượng sản phẩm: " + soLuong);
    }
}


public class Lab4Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SanPham_Bai2 sp1 = new SanPham_Bai2();
		SanPham_Bai2 sp2 = new SanPham_Bai2();

        
        System.out.println("Nhập thông tin sản phẩm 1:");
        sp1.nhap();

        System.out.println("Nhập thông tin sản phẩm 2:");
        sp2.nhap();

        
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
	}

}
