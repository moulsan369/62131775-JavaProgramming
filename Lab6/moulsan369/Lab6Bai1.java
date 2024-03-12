package moulsan369;

import java.util.Scanner;

public class Lab6Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();

       
        int firstSpaceIndex = fullName.indexOf(' ');
        int nextSpaceIndex = fullName.indexOf(' ', firstSpaceIndex + 1);

        
        String lastName = fullName.substring(0, firstSpaceIndex).toUpperCase();
        String middleName = "";
        String firstName = "";

       
        if (nextSpaceIndex != -1) {
            middleName = fullName.substring(firstSpaceIndex + 1, nextSpaceIndex).toLowerCase();
            firstName = fullName.substring(nextSpaceIndex + 1).toUpperCase();
        } else {
            firstName = fullName.substring(firstSpaceIndex + 1).toUpperCase();
        }

     
        System.out.println("Họ: " + lastName);
        System.out.println("Tên đệm: " + middleName);
        System.out.println("Tên: " + firstName);
    }
}
