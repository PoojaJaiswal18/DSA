package Backtracking;

public class CoinUsage {

    public static void coin(int []coins,int amount,String ans,int index){

        if(amount==0){

            System.out.println(ans);
            return;
        }

        if(amount<0){
            return;

        }

        for(int i=index;i<coins.length;i++){

            coin(coins,amount-coins[i],ans+coins[i],i);

        }
    }

    public static void main(String[] args) {

        int[]arr={2,3,5};

        coin(arr,8,"",0);

    }
}
