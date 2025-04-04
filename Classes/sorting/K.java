package Classes.sorting;

import java.util.*;

public class K {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i <T ; i++) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int n= sc.nextInt();
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
               if (map.containsKey(temp)){
                   int freq=map.get(temp);
                   map.replace(temp,freq+1);
               }
               else {
                   map.put(temp,1);
               }

            }

            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    int valueComparison = o1.getValue().compareTo(o2.getValue());
                    if (valueComparison == 0) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    return valueComparison;
                }
            });

            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.get(j).getValue(); k++) {
                    System.out.print(list.get(j).getKey() + " ");
                }

            }
            System.out.println();
        }

    }
}
