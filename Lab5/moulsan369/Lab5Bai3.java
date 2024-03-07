package moulsan369;

import java.util.*;

class SanPham_bai3lab5 {
    String tenSanPham;
    double giaSanPham;

    public SanPham_bai3lab5(String tenSanPham, double giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }
}

public class Lab5Bai3 {
    static ArrayList<SanPham_bai3lab5> danhSachSanPham = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXepVaXuat();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 5);
    }

    static void nhap() {
        scanner.nextLine(); 
        while (true) {
            System.out.print("Nhập tên sản phẩm (nhập 'stop' để kết thúc): ");
            String tenSanPham = scanner.nextLine();
            if (tenSanPham.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Nhập giá sản phẩm: ");
            double giaSanPham = scanner.nextDouble();
            danhSachSanPham.add(new SanPham_bai3lab5(tenSanPham, giaSanPham));
        }
    }

    static void sapXepVaXuat() {
        Comparator<SanPham_bai3lab5> comp = new Comparator<SanPham_bai3lab5>() {
            @Override
            public int compare(SanPham_bai3lab5 o1,SanPham_bai3lab5 o2) {
                return Double.compare(o2.giaSanPham, o1.giaSanPham);
            }
        };
        Collections.sort(danhSachSanPham, comp);
        System.out.println("===== Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá =====");
        for (SanPham_bai3lab5 sanPham : danhSachSanPham) {
            System.out.println("Tên: " + sanPham.tenSanPham + ", Giá: " + sanPham.giaSanPham);
        }
    }

    static void xoa() {
        scanner.nextLine(); 
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        boolean daXoa = false;
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).tenSanPham.equalsIgnoreCase(tenCanXoa)) {
                danhSachSanPham.remove(i);
                daXoa = true;
                break;
            }
        }
        if (daXoa) {
            System.out.println("Đã xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm cần xóa trong danh sách.");
        }
    }

    static void xuatGiaTrungBinh() {
        if (danhSachSanPham.size() == 0) {
            System.out.println("Không có sản phẩm nào trong danh sách.");
            return;
        }
        double tongGia = 0;
        for (SanPham_bai3lab5 sanPham : danhSachSanPham) {
            tongGia += sanPham.giaSanPham;
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}

