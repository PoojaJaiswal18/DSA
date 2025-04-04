package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int [] nextGreaterElement(Stack<Integer> st,int []arr){

        int [] greater=new int[arr.length];

//        for (int i = arr.length-1 ; i>=0; i--) {
//
//            if(st.isEmpty()){
//                st.push(arr[i]);
//                arr[i]=-1;
//            }
//
//            if(st.peek()>arr[i]){
//                int temp=arr[i];
//                arr[i]=st.peek();
//                st.push(temp);
//
//            }
//            else{
//                st.pop();
//                nextGreaterElement(st,arr);
//            }
//
//        }

        for (int j = arr.length-1; j >=0 ; j--) {

            while (!st.isEmpty()&&st.peek()<arr[j]){
                st.pop();
            }

            if(st.isEmpty()){
                st.push(arr[j]);
                arr[j]=-1;
            }
            else{
                int temp=arr[j];
                arr[j]=st.peek();
                st.push(temp);
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        int []arr={6,8,0,1,3};

       arr= nextGreaterElement(st,arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

        }

    }
}
