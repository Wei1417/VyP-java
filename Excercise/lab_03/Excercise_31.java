package lab_03;

import java.util.Scanner;

public class Excercise_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = scanner.nextInt();
        int [] myIntArray = new int[n];

        for (int index = 0; index < n; index++) {
            myIntArray[index] = scanner.nextInt();
        }
        int a = 0;
        int b = 0;
        for (int index = 0; index < n; index++) {
            if (myIntArray[index]%2 == 0) {
                a = a+1;
            }
            else
                b = b+1;
        }
        System.out.println("Tong so chan la " + a);
        System.out.println("Tong so le la " + b);
    }
}
;