package Strings;
//Given a string, print all the letters present at odd index, followed by the letters present at even index.

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(i%2!=0)
            System.out.print(s.charAt(i));
        }
        for(int i=0;i<len;i++){
            if(i%2==0)
                System.out.print(s.charAt(i));
        }
    }

}
