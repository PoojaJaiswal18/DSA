package Strings;

import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int len = s.length();
        boolean b = true;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
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
