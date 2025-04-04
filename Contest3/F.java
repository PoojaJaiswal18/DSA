package Contest3;
import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n;
        n=sc.nextLong();
        int num=(int) n;
        long []array=new long[num];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextLong();
        }

        for (int j = num-1; j >= 0; j--) {
            System.out.print(array[j]+" ");
        }




    }
}
