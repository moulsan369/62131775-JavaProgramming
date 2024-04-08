package moulsan369;

import java.util.Scanner;


class ChuNhat {
    protected double dai;
    protected double rong;

  
    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

  
    public double getChuVi() {
        return 2 * (dai + rong);
    }

  
    public double getDienTich() {
        return dai * rong;
    }


    public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}


class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh); 
    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + dai); 
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}


class SinhVienPoly {
    protected String hoTen;
    protected String nganh;


    public double getDiem() {
        return 0.0;
    }

    public String getHocLuc() {
        double diem = getDiem();
        if (diem >= 8.0) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5.0) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}


public class Lab7Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhap chieu dai cua hinh chu nhat: ");
        double daiCN = scanner.nextDouble();
        System.out.println("Nhap chieu rong cua hinh chu nhat: ");
        double rongCN = scanner.nextDouble();


        System.out.println("Nhap canh cua hinh vuong: ");
        double canhVuong = scanner.nextDouble();


        ChuNhat cn = new ChuNhat(daiCN, rongCN);

   
        ChuNhat vu = new Vuong(canhVuong);

     
        System.out.println("Thong tin hinh chu nhat:");
        cn.xuat();

        System.out.println("Thong tin hinh vuong:");
        vu.xuat();
    }
}
