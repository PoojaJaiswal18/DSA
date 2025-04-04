import java.util.*;
public class K {
    public static void main(String[] args) {
        int i, j,n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                    System.out.print("*");
                }
            System.out.println();

            }
        for(i=n-1;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        }

    }
