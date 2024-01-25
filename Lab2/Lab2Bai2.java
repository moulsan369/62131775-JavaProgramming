/**
 * 
 */
	import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập hệ số c: ");
		int c = scanner.nextInt();
		
		double x,x1,x2;
		
		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình vô nghiệm");
			} else {
				x = (double)-c/b;
				System.out.printf("Phương trình có 1 nghiệm: %.2f", x);
			}
		}else {
			double delta = b*b - 4*a*c;
			if (delta > 0) {
				 x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
		         x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
		         System.out.printf("Phương trình có 2 nghiệm: x1 = %.2f\nx2 = %.2f",x1,x2);
			} else if (delta == 0) {
	             x1 = (-b / (2 * a));
	             System.out.printf("Phương trình có nghiệm kép: x1 = x2", x1);
	        } else {
	             System.out.println("Phương trình vô nghiệm");
	        }
		}
		scanner.close();
	}
	

}
