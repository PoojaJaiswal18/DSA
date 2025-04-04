import java.util.*;

public class RemoveDuplicate {


    //sir approach

    static int[] arr= new int[256];

    public static void removeDuplicate(String ip, String ans){

        if(ip.length()==0){

            System.out.println(ans);
            return;

        }


        char c= ip.charAt(0);

        if(arr[c]==0){

            arr[c]++;

            removeDuplicate(ip.substring(1),ans+c);


        }
        else {
            removeDuplicate(ip.substring(1),ans);

        }

    }


    public static void remove(String ip, String ans, int pos){

        if(pos<ip.length()){


            if(ans.contains(""+ip.charAt(pos))){
                remove(ip,ans,pos+1);


            }
            else{

                remove(ip,ans+(ip.charAt(pos)),pos+1);

            }


        }
        else {
            System.out.println(ans);
        }





    }





    public static void main(String[] args) {

        remove("heello","",0);

        removeDuplicate("heello","");

    }


}
