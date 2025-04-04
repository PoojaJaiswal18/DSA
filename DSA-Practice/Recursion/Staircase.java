package Recursion;

import java.util.ArrayList;

public class Staircase {


      public static   ArrayList<Integer> result = new ArrayList<>();


    private static void ways(int numOfStaircase, ArrayList<Integer> result){

        if (numOfStaircase==0){
            System.out.println(result);
        }

        if(numOfStaircase<0){
            return;
        }


        //1 jump
        result.add(1);
        ways(numOfStaircase-1, result);
        result.remove(result.size()-1);

        //2 jumps
        result.add(2);
        ways(numOfStaircase-2, result);
        result.remove(result.size()-1);


    }

    //dice

    private static void diceWays(int numOfStaircase, ArrayList<Integer> result,int dice){

        if (numOfStaircase==0){
            System.out.println(result);
        }

        if(numOfStaircase<0){
            return;
        }


        for(int i=1;i<=dice;i++){

            result.add(i);
            diceWays(numOfStaircase-i, result,dice);
            result.remove(result.size()-1);

        }



    }



    public static void main(String[] args) {
        ways(6,result);

        System.out.println("Roll dice:");

        diceWays(6,result,6);
    }
}
