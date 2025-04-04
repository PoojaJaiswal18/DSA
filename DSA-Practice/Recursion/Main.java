import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer,Integer> map=new HashMap<>();

        String [] ans= new String[heights.length];

        for(int i=0;i<heights.length;i++){

            map.put(heights[i],i);

        }

        Arrays.sort(heights);

        for (int i=heights.length-1;i>=0;i++){

            ans[i]=names[map.get(heights[i])];

        }

        return ans;

    }
}