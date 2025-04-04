import java.util.*;

public class Chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,i;
        T=sc.nextInt();
        int[]cap=new int[T];
        for(i=0;i<T;i++){
            cap[i]=sc.nextInt();
        }
        for ( i = 0; i < T; i++) {
            if(cap[i]<2000){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
