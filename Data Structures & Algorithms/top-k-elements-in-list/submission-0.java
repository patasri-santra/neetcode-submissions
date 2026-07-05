class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> key = new ArrayList<>(frequency.keySet());

        key.sort((a,b) -> frequency.get(b) - frequency.get(a));

        for(int i=0; i<k; i++){
            result[i] = key.get(i);
        }

        return result;
    }
}
