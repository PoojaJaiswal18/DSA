package Contest3;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n,index=0;
        long min = Long.MAX_VALUE;
        n = sc.nextLong();
        long[] array = new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }

        System.out.println(index);


    }
}
