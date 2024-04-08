package moulsan369;

import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }

  
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\d{10}$";
        return phoneNumber.matches(regex);
    }

   
    public static boolean isValidCMND(String cmnd) {
        String regex = "^\\d{9}$";
        return cmnd.matches(regex);
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }
}

public class Lab6Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien[] danhSach = new SinhVien[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            String email;
            do {
                System.out.print("Email: ");
                email = scanner.nextLine();
                if (!SinhVien.isValidEmail(email)) {
                    System.out.println("Email khong hop le. Vui long nhap lai!");
                }
            } while (!SinhVien.isValidEmail(email));

            String soDienThoai;
            do {
                System.out.print("So dien thoai: ");
                soDienThoai = scanner.nextLine();
                if (!SinhVien.isValidPhoneNumber(soDienThoai)) {
                    System.out.println("So dien thoai khong hop le. Vui long nhap lai!");
                }
            } while (!SinhVien.isValidPhoneNumber(soDienThoai));

            String cmnd;
            do {
                System.out.print("CMND: ");
                cmnd = scanner.nextLine();
                if (!SinhVien.isValidCMND(cmnd)) {
                    System.out.println("CMND khong hop le. Vui long nhap lai!");
                }
            } while (!SinhVien.isValidCMND(cmnd));

            danhSach[i] = new SinhVien(hoTen, email, soDienThoai, cmnd);
        }

        System.out.println("Danh sach sinh vien:");
        for (int i = 0; i < 5; i++) {
            danhSach[i].xuat();
            System.out.println("-------------------");
        }
    }
}
