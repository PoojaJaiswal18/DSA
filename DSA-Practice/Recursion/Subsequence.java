package Recursion;

public class Subsequence {

    public static void subsequence(String ip, String ans,int pos){

        //base condition

        if (pos< ip.length()){

            //select element

            subsequence(ip,ans+ip.charAt(pos),pos+1);


            // deselect element

            subsequence(ip,ans,pos+1);

        }
        else{
            System.out.println(ans);
        }






    }

    public static void main(String[] args) {

        subsequence("abc","",0);

    }
}
