package Contest3;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n,num;
        boolean b=false;
        n=sc.nextLong();
        long []array=new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextLong();
        }
        num=sc.nextLong();

        for (int i = 0; i < n; i++) {

            if(array[i]==num){
               b=true;
               break;
           }
        }
        if(b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
