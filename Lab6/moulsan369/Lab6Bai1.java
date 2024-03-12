package moulsan369;

import java.util.Scanner;

public class Lab6Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();

        // Tìm vị trí của dấu cách đầu tiên và dấu cách tiếp theo sau dấu cách đầu tiên
        int firstSpaceIndex = fullName.indexOf(' ');
        int nextSpaceIndex = fullName.indexOf(' ', firstSpaceIndex + 1);

        // Tách họ, tên đệm và tên
        String lastName = fullName.substring(0, firstSpaceIndex).toUpperCase();
        String middleName = "";
        String firstName = "";

        // Kiểm tra xem có tên đệm không
        if (nextSpaceIndex != -1) {
            middleName = fullName.substring(firstSpaceIndex + 1, nextSpaceIndex).toLowerCase();
            firstName = fullName.substring(nextSpaceIndex + 1).toUpperCase();
        } else {
            firstName = fullName.substring(firstSpaceIndex + 1).toUpperCase();
        }

        // In ra kết quả
        System.out.println("Họ: " + lastName);
        System.out.println("Tên đệm: " + middleName);
        System.out.println("Tên: " + firstName);
    }
}
