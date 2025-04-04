package Stack;

import java.util.ArrayList;

public class ArrayListImplementation {

    public static ArrayList<Integer> stack=new ArrayList<>();

    public static boolean isEmpty(){

        return stack.size()==0;
    }

    public static void push(int val){

        stack.add(val);
    }

    public static int pop(){

        if(isEmpty()){
            return -1;
        }

        int num=stack.remove(stack.size()-1);
        return num;
    }

    public static int peek(){
        return stack.get(stack.size()-1);
    }

    public static void main(String[] args) {

        push(1);
        System.out.println(peek());
        push(2);
        System.out.println(peek());
        pop();
        System.out.println(peek());



    }
}
