package PrefixSum;
import java.util.*;
//For each q print a single line containing an integer, the sum of elements in the range L and R


public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q= sc.nextInt();
        int []arr=new int[n];
        int []prefixSum=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i -1] + arr[i];
        for (int i = 0; i <n ; i++) {
            System.out.println(prefixSum[i]);
        }

        for(int i=0;i<q;i++){
            int L,R,ans;
            L= sc.nextInt();
            R=sc.nextInt();


            ans=prefixSum[R+1]-prefixSum[L-1];
            System.out.println(ans);

        }
    }
}
