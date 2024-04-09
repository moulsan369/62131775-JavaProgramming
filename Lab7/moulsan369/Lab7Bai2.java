package moulsan369;

abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

  
    public abstract double getDiem();

  
    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}

class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCSS;
    private double diemHTML;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
  
        return (diemJava + diemCSS + diemHTML) / 3;
    }
}

class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
       
        return (2 * diemMarketing + diemSales) / 3;
    }
}

public class Lab7Bai2 {
    public static void main(String[] args) {
  
        SinhVienIT svIT = new SinhVienIT("Moul San", "IT", 8.5, 7.0, 9.0);
   
        System.out.println("Thông tin sinh viên IT:");
        svIT.xuat();

     
        SinhVienBiz svBiz = new SinhVienBiz("Mai Anh", "Biz", 7.5, 8.0);

        System.out.println("\nThông tin sinh viên Biz:");
        svBiz.xuat();
    }
}
