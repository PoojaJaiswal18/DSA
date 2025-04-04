package Classes.sorting;

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                int freq=map.get(s.charAt(i));
                map.replace(s.charAt(i),freq+1);
            }
            else {
                map.put(s.charAt(i),1);
            }

        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                int valueComparison = o1.getValue().compareTo(o2.getValue());
                if (valueComparison == 0) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return valueComparison;
            }
        });

        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < list.get(j).getValue(); k++) {
               ans.append( list.get(j).getKey());
            }

        }
return ans.toString();
    }
}


