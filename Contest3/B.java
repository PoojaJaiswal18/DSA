package Contest3;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       long n;
        long sum=0;
        n=sc.nextLong();
        for (int i = 0; i < n; i++) {
            sum=sum+sc.nextLong();
        }
        System.out.println(sum);

    }
}

