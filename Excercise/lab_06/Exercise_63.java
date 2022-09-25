package lab_06;

import java.util.Scanner;

public class Exercise_63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap string: ");
        String input = in.next();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                output = output + c;
            }
        }
        System.out.println(output);
    }
}
