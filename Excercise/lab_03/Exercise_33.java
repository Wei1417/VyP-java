package lab_03;

import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = scanner.nextInt();
        int [] myIntArray = new int[n];
        for (int index = 0; index < n; index++) {
             myIntArray[index] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int a = 0;
            for (int j = i; j < n; j ++){
                if (myIntArray[j] < min) {
                    min = myIntArray[j];
                    a = j;
                }
            }
            int b = myIntArray[i];
            myIntArray[i] = myIntArray[a];
            myIntArray[a] = b;
        }
        System.out.println("KQ ");
        for (int index = 0; index < n; index++) {
            System.out.println(myIntArray[index]);

        }
    }
}
