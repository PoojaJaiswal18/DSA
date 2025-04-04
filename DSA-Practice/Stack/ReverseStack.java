package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> st){

       if (st.empty()){
           return ;
       }
        System.out.println(st);

            int num= st.pop();
            reverseStack(st);
            st.push(num);

    }

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        for (int i = 1; i <= 3; i++) {
            st.push(i);
        }
        reverseStack(st);

    }
}
