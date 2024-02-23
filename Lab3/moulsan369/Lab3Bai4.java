/**
 * 
 */
package moulsan369;
import java.util.Scanner;
/**
 * 
 * 
 */
public class Lab3Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] hoTen = new String[n];
        double[] diem = new double[n];
        String[] hocLuc = new String[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            diem[i] = scanner.nextDouble();
            scanner.nextLine();
         
            if (diem[i] < 5) {
                hocLuc[i] = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung bình";
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Khá";
            } else if (diem[i] < 9) {
                hocLuc[i] = "Giỏi";
            } else {
                hocLuc[i] = "Xuất sắc";
            }
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    
                    double tempDiem = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempDiem;

                    
                    String tempHoTen = hoTen[j];
                    hoTen[j] = hoTen[j + 1];
                    hoTen[j + 1] = tempHoTen;

                   
                    String tempHocLuc = hocLuc[j];
                    hocLuc[j] = hocLuc[j + 1];
                    hocLuc[j + 1] = tempHocLuc;
                }
            }
        }

        
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc[i]);
            System.out.println();
        }
    }
}
