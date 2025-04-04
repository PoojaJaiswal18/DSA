package Stack;

import java.util.Stack;

public class ReverseString {

    public static  String reverse(String str){

        Stack<Character> st=new Stack<>();


        for (int i = 0; i <str.length() ; i++) {
            st.push(str.charAt(i));
        }

        for (int i = 0; i <str.length() ; i++) {
            char c= st.pop();
            System.out.println(c);
            str.replace(str.charAt(i), c);
            System.out.println("Swapped String = "+str);
        }

       return str;

    }



    public static void main(String[] args) {

        System.out.println(reverse("abc"));


    }
}
