package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

class Parenthesis
{
    public static void printParenthesis(int countOpen,int countClose,String ans) {

        if (countOpen == 0 && countClose == 0) {
            System.out.println(ans);
        }

        if(countClose<countOpen){
            return;
        }

        if(countOpen!=0){
            printParenthesis(countOpen-1,countClose,ans+"(");

        }

        if(countClose!=0){
            printParenthesis(countOpen,countClose-1,ans+")");

        }


    }


    public static void main (String[] args)  {

        printParenthesis(3,3,"");



    }
}