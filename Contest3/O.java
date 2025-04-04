package Contest3;

import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n;
        long sum=0;
        n=sc.nextLong();
        long []array=new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextLong();

        }

        System.out.println(sum);
    }
}
