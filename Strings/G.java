package Strings;
import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();

        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                System.out.print(Character.toLowerCase(c));
            }

            else if (c >= 'a' && c <= 'z') {
                System.out.print(Character.toUpperCase(c));
            }
            else {
                System.out.print(c);
            }
        }
    }
}
