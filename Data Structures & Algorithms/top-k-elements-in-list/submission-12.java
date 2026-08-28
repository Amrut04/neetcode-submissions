class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> key = new ArrayList(map.keySet());
        key.sort((a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = key.get(i);
        }
        return result;
    }
}
