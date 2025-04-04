package Strings;
//Given a string, print count of vowels and consonants in the string.
import java.util.*;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int len = s.length();
       int v=0;
       int con=0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
             v=v+1;

            }
            else{
                con=con+1;
            }
        }

        System.out.println(v+" "+con);
    }
}
