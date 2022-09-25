package lab_02;

import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = scanner.nextInt();
        int number_1 = number%2;
        if (number_1 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
