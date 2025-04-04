import java.util.*;
import java.lang.*;

public class MultipleOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T,i;
        boolean b=false;

        T = sc.nextInt();
        for (i = 0; i < T; i++) {

            int size= sc.nextInt();
            String num= sc.next();

            if((num.contains("0"))||(num.contains("5"))){
                    b =true;
            }
            else {
                b=false;
            }
            if(b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}
