package Stack;

import java.util.Stack;

public class MaxRectangleAreaInHistogram {

    public static int[] NSL(int []arr){
        int []ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for (int i = 0; i < arr.length ; i++) {
            while (!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }

        return ans;
    }

    public static int[] NSR(int []arr){
        int []ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for (int i =  arr.length -1; i >=0; i--) {
            while (!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=arr.length;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }

        return ans;
    }


    public static int maxArea(int[]arr) {
        int max=Integer.MIN_VALUE;

        int []NSL=NSL(arr);
        int []NSR=NSR(arr);

        for(int i=0;i< arr.length;i++){
            int width=NSR[i]- NSL[i]-1;
            int area=arr[i]*width;
            max=(area>max?area:max);
        }

        return max;
    }


    public static void main(String[] args) {

        int []arr={2,1,5,6,2,3};

        System.out.println(maxArea(arr));
    }




}
