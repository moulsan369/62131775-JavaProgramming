/**
 * 
 */
	import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int chon;
	        Scanner scanner = new Scanner(System.in);

	        do {
	            chon = menu();
	            switch (chon) {
	                case 1:
	                    Lab2Bai1();
	                    break;
	                case 2:
	                    Lab2Bai2();
	                    break;
	                case 3:
	                    Lab2Bai3();
	                    break;
	                case 4:
	                    System.out.println("End");
	                    break;
	                default:
	                    System.out.println("Error");
	            }

	        } while (chon != 4);

	        
	        scanner.close();
	    }

	    public static int menu() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("+---------------------------------------------------+");
	        System.out.println("-    	1. Giải phương trình bậc nhất               -");                   
	        System.out.println("-    	2. Giải phương trình bậc 2                  -");
	        System.out.println("-	3. Tính tiền điện                           -");
	        System.out.println("-	4. Kết thúc                                 -");
	        System.out.println("+---------------------------------------------------+");
	        System.out.print("Chọn chức năng: ");
	        return scanner.nextInt();
	    }

	    public static void Lab2Bai1() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập giá trị a: ");
	        int a = scanner.nextInt();

	        System.out.print("Nhập giá trị b: ");
	        int b = scanner.nextInt();

	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô số nghiệm");
	            } else {
	                System.out.println("Phương trình vô nghiệm");
	            }
	        } else {
	            double nghiem = (double) -b / a;
	            System.out.printf("Chương trình có nghiệm: %.2f", nghiem);
	        }

	       
	        scanner.close();
	    }

	    public static void Lab2Bai2() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập hệ số a: ");
	        int a = scanner.nextInt();
	        System.out.print("Nhập hệ số b: ");
	        int b = scanner.nextInt();
	        System.out.print("Nhập hệ số c: ");
	        int c = scanner.nextInt();

	        double x, x1, x2;

	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm");
	            } else {
	                x = (double) -c / b;
	                System.out.printf("Phương trình có 1 nghiệm: %.2f", x);
	            }
	        } else {
	            double delta = b * b - 4 * a * c;
	            if (delta > 0) {
	                x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.printf("Phương trình có 2 nghiệm: x1 = %.2f\nx2 = %.2f", x1, x2);
	            } else if (delta == 0) {
	                x1 = -b / (2 * a);
	                System.out.printf("Phương trình có nghiệm kép: x1 = x2 = %.2f", x1);
	            } else {
	                System.out.println("Phương trình vô nghiệm");
	            }
	        }

	        
	        scanner.close();
	    }

	    public static void Lab2Bai3() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số điện: ");
	        int soDien = scanner.nextInt();

	        int giaDuoi = 1000;
	        int giaTren = 1200;
	        int tien;

	        if (soDien <= 50) {
	            tien = soDien * giaDuoi;
	        } else {
	            tien = 50 * giaDuoi + (soDien - 50) * giaTren;
	        }
	        System.out.printf("Tiền điện phải thanh toán: %d", tien);

	        
	        scanner.close();
	    }
}
