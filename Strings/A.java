package Strings;
import java.util.*;

//Given a string, reverse the given string in-place and then print it.

public class A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        int len=s.length();
        for(int i=len-1;i>=0;--i){
            System.out.print(s.charAt(i));
        }

    }
}
