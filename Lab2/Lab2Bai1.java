/**
 * 
 */
	import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập giá trị a: ");
		int a = scanner.nextInt();
		
		System.out.print("Nhập giá trị b: ");
		int b = scanner.nextInt();
		
		double nghiem; 
		if(a == 0) {
			if(b == 0) {
				System.out.print("Phương trình vô số nghiệm");
			} else {
				System.out.print("Phương trình vô nghiệm");
			}
		} else {
			nghiem = (double) -b/a;
			System.out.printf("Chương trình có nghiệm: %.2f", nghiem);
		}
		scanner.close();
		}
		
}	

