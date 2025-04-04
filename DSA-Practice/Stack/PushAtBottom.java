package Stack;

//push at the bottom of stack

import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> st,int num){

        if(st.empty()){
            st.push(num);
            return;
        }

        int element=st.pop();
        pushAtBottom(st,num);
        st.push(element);

    }

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        for (int i = 1; i <=3 ; i++) {
            st.push(i);
        }

        System.out.println(st);
        pushAtBottom(st,4);
        System.out.println(st);

    }
}
