package moulsan369;

import java.util.Scanner;

class sanPham_Bai4 {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public sanPham_Bai4 (String tenSp, double donGia, double giamGia ) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public sanPham_Bai4 (String tenSp, double donGia) {
		this (tenSp, donGia, 0);
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
	  
	  public String getTenSp() {
	        return tenSp;
	    }

	  public void setTenSp(String tenSp) {
	        this.tenSp = tenSp;
	    }
	    
	  public double getDonGia() {
	        return donGia;
	    }

	  public void setDonGia(double donGia) {
	        this.donGia = donGia;
	    }
	  
	  public double getGiamGia() {
	        return giamGia;
	    }

	    public void setGiamGia(double giamGia) {
	        this.giamGia = giamGia;
	    }

}


public class Lab4bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sanPham_Bai4 sp1 = new sanPham_Bai4("Cà phê Di Linh", 94.4, 10.0);
			sanPham_Bai4 sp2 = new sanPham_Bai4("Cà phê Đơn Dương", 81.3);

	       
	        sp1.setTenSp("Hồ tiêu");
	        sp1.setDonGia(150.0);
	        sp1.setGiamGia(20.0);

	        
	        System.out.println("Thông tin sản phẩm 1:");
	        System.out.println("Tên sản phẩm: " + sp1.getTenSp());
	        System.out.println("Giá sản phẩm: " + sp1.getDonGia());
	        System.out.println("Giảm giá: " + sp1.getGiamGia());

	        System.out.println("Thông tin sản phẩm 2:");
	        System.out.println("Tên sản phẩm: " + sp2.getTenSp());
	        System.out.println("Giá sản phẩm: " + sp2.getDonGia());
	        System.out.println("Giảm giá: " + sp2.getGiamGia());
	    }

}
