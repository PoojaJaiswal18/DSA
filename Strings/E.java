package Strings;
//Given a string, check if it contains only digits.

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int len = s.length();
        boolean b = true;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
