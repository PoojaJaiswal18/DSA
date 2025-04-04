public class CoinToss {



    public static void AllPossiblities(int coinNumbers, String ans) {

        if(coinNumbers==0){
            System.out.println(ans);
            return;

        }

    //head
        AllPossiblities(coinNumbers-1,ans+"H");

     //tail
        AllPossiblities(coinNumbers-1,ans+"T");


    }

    public static void ConsecutiveHeads(int coinNumers, String ans) {

        if (coinNumers == 0) {
            System.out.println(ans);
            return;
        }

        if (ans.length() == 0 || ans.charAt(ans.length() - 1) == 'T') {
            ConsecutiveHeads(coinNumers - 1, ans + "T");
            ConsecutiveHeads(coinNumers - 1, ans + "H");
        } else {
            ConsecutiveHeads(coinNumers - 1, ans + "T");
        }
    }




    public static void main(String[] args) {

        AllPossiblities(3,"");

        System.out.println("Consecutive heads:");

        ConsecutiveHeads(3,"");

    }
}
