
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        int W, L;
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        L = sc.nextInt();

        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= W; j++) {
                if (i == 1 || i == L || j == 1 || j == W) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
