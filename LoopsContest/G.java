import java.util.*;

public class G{
    public static void main(String[] args) {
        int size,max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int []arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}
