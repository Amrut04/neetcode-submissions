class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int n : nums){
        maps.put(n,maps.getOrDefault(n,0)+1);
        }
        List<Integer> keys = new ArrayList(maps.keySet());
        keys.sort((a,b) -> maps.get(b) - maps.get(a));

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = keys.get(i);
        }
        return result;
    }
}
