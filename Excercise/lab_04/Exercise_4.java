package lab_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_4 {
    public static void printMenu() {
        System.out.println("=====Menu=====");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        ArrayList<Integer> current = new ArrayList<>();
        int currentMax = Integer.MIN_VALUE;
        int currentMin = Integer.MAX_VALUE;
        boolean isExit = false;
        Scanner in = new Scanner(System.in);
        while (!isExit) {
            printMenu();
            int operation = in.nextInt();
            switch (operation) {
                case 1:
                    int number = in.nextInt();
                    current.add(number);
                    if (number > currentMax) {
                        currentMax = number;
                    }
                    if (number < currentMin) {
                        currentMin = number;
                    }
                    break;
                case 2:
                    for (int i = 0; i < current.size(); i++) {
                        System.out.print(current.get(i) + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (currentMax == Integer.MIN_VALUE) {
                        System.out.println(0);
                    } else {
                        System.out.println(currentMax);
                    }
                    break;
                case 4:
                    if (currentMin == Integer.MAX_VALUE) {
                        System.out.println(0);
                    } else {
                        System.out.println(currentMin);
                    }
                    break;
                case 5:
                    isExit = true;
                    break;
            }
        }
    }
}
