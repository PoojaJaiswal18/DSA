package Classes.sorting;
import java.util .*;


public class B {


        public int lengthOfLastWord(String s) {
            int length=0;

            for(int i=s.length();i>0;i--){
                if(s.charAt(i)==(null)){
                    break;
                }
                else{
                    length+=1;
                }
            }

            return length;

        }

 int maxFrequencyElements(int[] nums) {
            HashMap <Integer,Integer> map = new HashMap<>();
            int max=0;
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.replace(nums[i],(map.get(nums[i])+1));
                    if(map.get(nums[i])>max){
                        max=map.get(nums[i]);
                    }
                }
                else{
                    map.put(nums[i],1);
                    if(map.get(nums[i])>max){
                        max=map.get(nums[i]);
                    }
                }
                int count=0;
                for(int key : map.keySet()){
                    if(map.get(key)==max){
                        count++;
                    }
                }

                return count;

            }



        public int leastInterval(char[] tasks, int n) {

        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        boolean b=true;

        for(int i=0;i<tasks.length;i++){
            if(map.containsKey(tasks[i])){
                map.replace(tasks[i],((map.get(tasks[i]))+1));
            }
            else {
                map.put(tasks[i], 1);
            }

        }


            for(int i=0;i< map.size();i++){
                if(map.get(tasks[i])>0){
                    if(map.containsKey(tasks[i])&& n<i);
                    count++;
                    map.replace(tasks[i], (map.get(tasks[i])-1));

                    map.re
                }
            }











    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            for(i=0;i<n;i++){

            }


        }
    }
    }



