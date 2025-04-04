package PrefixSum;
import java.util.*;

public class F {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        String []arr=new String[n];
        int []count=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
            if(i==0){
                System.out.println("OK");
                count[i]=count[i]+1;
            }
            else{
                if(count[i]>0){
                    System.out.println(arr[i]+count[i]);
                }
                else{
                    count[i]=count[i]+1;
                    System.out.println("OK");

                }
            }
        }

    }
}
