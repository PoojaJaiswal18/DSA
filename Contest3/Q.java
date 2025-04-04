package Contest3;
import java.util.*;

public class Q {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n,key,index=-1;

        n=sc.nextLong();
        key=sc.nextLong();
        long []array=new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextLong();
            if(array[i]==key){
                index=i;
            }

        }

        System.out.println(index);
    }
    }

