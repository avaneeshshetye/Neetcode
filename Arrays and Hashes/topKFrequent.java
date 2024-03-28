import java.util.*;

class topKFrequent {
    @SuppressWarnings("unchecked")
    public int[] topK_Frequent(int[] nums, int k) {
        // Count the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a max heap based on the frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        for(@SuppressWarnings("rawtypes") Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }

        // Get the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        
        return result;
    }
}
