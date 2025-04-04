package Strings;
//Given a string, compute the length of longest proper prefix which is same as the suffix of the given string.

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        int count=0;
        int len=s.length();

            for(int j=0;j<len;j++){
                for(int i=len-1;i>=0;--i){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
