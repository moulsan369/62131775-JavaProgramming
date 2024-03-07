package moulsan369;

import java.util.*;

public class Lab5Bai2 {
    static ArrayList<String> danhSachHoTen = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngauNhien();
                    break;
                case 4:
                    sapXepGiamDan();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 6);
    }

    static void nhap() {
        scanner.nextLine(); 
        while (true) {
            System.out.print("Nhập họ và tên (nhập 'stop' để kết thúc): ");
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("stop")) {
                break;
            }
            danhSachHoTen.add(hoTen);
        }
    }

    static void xuat() {
        System.out.println("===== Danh sách họ và tên =====");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    static void ngauNhien() {
        Collections.shuffle(danhSachHoTen);
        System.out.println("===== Danh sách ngẫu nhiên =====");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    static void sapXepGiamDan() {
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
        System.out.println("===== Danh sách sắp xếp giảm dần =====");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    static void xoa() {
        scanner.nextLine(); 
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean daXoa = false;
        for (int i = 0; i < danhSachHoTen.size(); i++) {
            if (danhSachHoTen.get(i).equalsIgnoreCase(hoTenCanXoa)) {
                danhSachHoTen.remove(i);
                daXoa = true;
                break;
            }
        }
        if (daXoa) {
            System.out.println("Đã xóa thành công.");
        } else {
            System.out.println("Không tìm thấy họ tên cần xóa trong danh sách.");
        }
    }
}