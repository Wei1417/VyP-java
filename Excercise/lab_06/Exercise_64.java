package lab_06;

import java.util.Scanner;

public class Exercise_64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap url: ");
        String url = in.next();

        String http = url.substring(0, url.indexOf(':'));
        String domain = url.replaceAll("http(s)?://|/.*", "");
        String com = url.substring(url.lastIndexOf('.') + 1);
        if (com.endsWith("/")) {
            com = com.substring(0, com.length() - 1);
        }
        System.out.println(http);
        System.out.println(domain);
        System.out.println(com);
    }
}
