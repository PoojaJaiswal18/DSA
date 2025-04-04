package Strings;
import java.util.*;
//Given a sentence S and a character ch, count occurrence of the given character in the sentence
public class B {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int count=0;
      char c;

        s=sc.nextLine();
        c=sc.next().charAt(0);
        int len=s.length();

        for(int i=0;i<len;i++){
            if(c==s.charAt(i)){
                count=count+1;
            }

        }

        System.out.println(count);

    }
}
