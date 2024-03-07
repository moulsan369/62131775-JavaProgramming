package moulsan369;

import java.util.*;

public class Lab5Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        
        while (true) {
            System.out.print("Nhập số thực: ");
            double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); 
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        
        
        System.out.println("Danh sách số thực vừa nhập:");
        for (Double num : list) {
            System.out.println(num);
        }
        
       
        double sum = 0;
        for (Double num : list) {
            sum += num;
        }
        System.out.println("Tổng của danh sách: " + sum);
        
        scanner.close();
	}

}
