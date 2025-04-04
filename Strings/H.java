package Strings;
import java.util.*;
//Given a string, compress the given string. See example for more details.

public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;

        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){


                if (((i+1)<s.length())&&((s.charAt(i + 1)) == (s.charAt(i)))) {
                    count++;

                } else {
                    System.out.print(s.charAt(i) + count);
                    count = 1;
                }



        }
    }
}


