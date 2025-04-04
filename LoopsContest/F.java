import java.util.Scanner;

public class F {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T,i;

            T = sc.nextInt();
            for (i = 0; i < T; i++) {
                int j,n,s=0,h=0;
                int[] arr=new int[3];
                for(j=0;j<3;j++){
                    arr[j]=sc.nextInt();
                    if(arr[j]==0){
                        s=s+1;
                    }
                }
                for (int k = 0; k < 3; k++) {
                    arr[k]= sc.nextInt();
                    if (arr[k]==0){
                        h=h+1;
                    }

                }
                if(s==h){
                    System.out.println("Pass");
                }else {
                    System.out.println("Fail");
                }





            }
        }
    }

