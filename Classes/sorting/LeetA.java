import java.util.*;

class A {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int freqComparison = o1.getValue().compareTo(o2.getValue());
                if (freqComparison == 0) {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return freqComparison;
            }
        });


        int[] arr = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int key = entry.getKey();
            int value = entry.getValue();
            for (int i = 0; i < value; i++) {
                arr[index++] = key;
            }
        }
        return arr;
    }
}
