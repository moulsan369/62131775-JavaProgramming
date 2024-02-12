/**
 * 
 */
package moulsan369;
import java.util.Scanner;
/**
 * 
 */
public class Lab3bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên bất kỳ: ");
		int soBatKy = scanner.nextInt();
		boolean oK = true;
		
		for (int i = 2; i <= soBatKy-1; i++) {
			if(soBatKy % i == 0) {
				oK = false;
				break;
			}
		}
		
		if (oK) {
			System.out.println(soBatKy + " Là một số nguyên tố");
		} else {
			System.out.println(soBatKy + " Không phải là số nguyên tố");
		}
		
		scanner.close();
		
	}

}
