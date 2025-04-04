import java.util.*;
public class H {
    public static void main(String[] args) {
        int i,j,num=1,rows;
        Scanner sc= new Scanner(System.in);
        rows=sc.nextInt();
        for(i=1;i<=rows;i++){
            for (j = 1; j<= i; j++) {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
        }
    }
}
