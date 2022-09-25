package lab_03;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = scanner.nextInt();
        int[] myIntArray = new int[n];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < n; index++) {
            myIntArray[index] = scanner.nextInt();
            if (myIntArray[index] > max) {
                max = myIntArray[index];
            } else if (myIntArray[index] < min) {
                min = myIntArray[index];
            }
        }
        System.out.println("So lon nhat la " + max);
        System.out.println("So nho nhat la " + min);
    }
}
