import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, size, i, j, k, count = 0;

        T = sc.nextInt();
        for (i = 0; i < T; i++) {
            boolean b = false;
            size = sc.nextInt();
            int[] arr = new int[size];
            for (j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 0) {
                    b=true;
                    for (k = size - j; k < size; --k) {
                        sc.nextInt();
                        break;
                    }
                } else if (arr[j] < 0) {
                    count = count + 1;
                }
            }
            if(b){
                System.out.println("0");
            }
            else {

                if (count % 2 == 0) {
                    System.out.println("0");

                } else {
                    System.out.println("1");
                }
            }

        }
    }
}


