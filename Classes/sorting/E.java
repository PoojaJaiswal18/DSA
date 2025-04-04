package Classes.sorting;
import java.util.*;

public class E {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int start = 0, end = n - 1;

            while (start < end) {
                if (arr[start] == 1) {
                    swap(arr, start, end);
                    end--;
                } else {
                    start++;
                }
            }

            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
    }
}
