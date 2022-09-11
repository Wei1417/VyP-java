package lab_02;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight: ");
        float weight = scanner.nextFloat();
        System.out.println("Please input your height");
        float height = scanner.nextFloat();
        float BMI = weight/(height*2);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else
            if (BMI <= 24.9) {
                System.out.println("Normal weight");
            }
            else
                if (BMI <= 29.9) {
                    System.out.println("Overweight");
                }
                else
                    if (BMI >=30) {
                        System.out.println("Obesity");
                    }
    }
}
