package lab_06;

import java.util.Scanner;

public class Exercise_62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myPassword = "password123";
        int numTry = 3;
        while (numTry > 0) {
            String userPassword = in.next();
            if (myPassword.equals(userPassword)) {
                System.out.println("Password dung");
                break;
            }
            numTry--;
        }
        if (numTry == 0) {
            System.out.println("Vuot qua so lan nhap");
        }
    }
}
