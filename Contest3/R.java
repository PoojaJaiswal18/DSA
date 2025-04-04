package Contest3;

import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T;
        T=sc.nextInt();
        for(int j=0;j<T;j++){
            long n, sum=0;
        n = sc.nextLong();
        long[] array = new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            sum=sum+array[i];

            }
            System.out.println(sum);
        }


    }
    }

