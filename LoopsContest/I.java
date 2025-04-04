import java.util.*;
public class I {
    public static void main(String[] args) {
        int i, j, num = 1, rows;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            int temp = num;
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + (rows - j);
            }
            num = temp + 1;
            System.out.println();
        }
    }
}
