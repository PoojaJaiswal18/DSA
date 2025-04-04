package jaisu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, size, i, j;
        T = sc.nextInt();
        for (i = 0; i < T; i++) {
            int sum = 0;
           int  min = Integer.MAX_VALUE;
            size = sc.nextInt();
            int[] arr = new int[size];

            for (j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
                sum = sum + arr[j];

                if (arr[j] < min) {
                    min = arr[j];
                }
            }

            System.out.println(sum - min);


        }


    }
}
