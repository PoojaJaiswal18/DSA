import java.util.*;

public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i, a = 0, b = 0;
        String s1, s2;
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            s1 = sc.next();
            s2 = sc.next();
            m = s1.compareTo(s2);
            if (m < 0) {
                b = b + 3;
            } else if (m > 0) {
                a = a + 3;
            } else {
                a = a + 1;
                b = b + 1;
            }

        }
        System.out.println(a + " " + b);

    }
}








