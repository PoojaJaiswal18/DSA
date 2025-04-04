package Backtracking;

import java.util.ArrayList;

public class UniquePermutation {



    public static void permutation(String str,String ans){

        ArrayList<String> list=new ArrayList<>();


        if(str.length()==0){

            if(list.contains(ans)){
                return;
            }

            list.add(ans);
            System.out.println(ans);
            return;

        }

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
            String before=str.substring(0,i);
            String after=str.substring(i+1);
            permutation( before+after,ans+c);

        }

    }

    public static void main(String[] args) {

        permutation("aac","");

    }
}
