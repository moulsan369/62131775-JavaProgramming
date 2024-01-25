/**
 * 
 */
	import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

