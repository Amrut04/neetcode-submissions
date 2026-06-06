class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>(); 
        List<Integer>[] bucket = new ArrayList[nums.length +1];

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.keySet()){
            int freq = map.get(i);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(i);
        }

        int result[] = new int[k];
        int count = 0;
        for(int pos = bucket.length - 1;pos>=0 && count < k;pos--){
        //for (int pos = bucket.length - 1; pos >= 0 && count < k; pos--)
            if(bucket[pos] != null){
                for(int i : bucket[pos]){
                result[count++] = i ;

                
                }
            }
        }
        return result;
    }
}
