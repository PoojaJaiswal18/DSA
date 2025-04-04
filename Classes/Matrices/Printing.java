package Classes.Matrices;

import java.util.Scanner;

public class Printing {

    static void horizontal(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }

    }

    static void vertical(int [][]arr){
        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print("\t"+arr[j][i]);
            }
            System.out.println();

        }

    }


    static void molar(int [][]arr){
        int row=arr.length;
        int col=arr[0].length;
        System.out.println(arr[0][0]+"\t");
        int sum=1;
        while(sum<= arr.length) {
            for (int i = 0; i < sum; i++) {
                if(sum==arr.length){

                for (int j = sum-1; j > 0; j--) {
                    System.out.print("\t" + arr[j][i]);
                }
                sum++;
                System.out.println();

            }
                else{
                    for (int j = sum; j > 0; j--) {
                        System.out.print("\t" + arr[j][i]);
                    }
                    sum++;
                    System.out.println();
                }
        }
        }

    }





    public static void main(String[] args) {
        int n=4;
        int [][]arr=new int[n][n];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
            arr[i][j]=sc.nextInt();
            }

        }
//        System.out.println("horizontal");
//        horizontal(arr);
//        System.out.println("Vertical");
//        vertical(arr);
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

        molar(arr);
    }

}
