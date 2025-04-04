import java.util.*;
public class Y {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int []arr=new int[n];

        for (i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (j =n-1; j >=0 ; j--) {
            if(j==0){
                System.out.println(arr[j]);
            }
           else {
                System.out.print(arr[j]+" ");
            }
        }
        System.out.println();
    }
}
