class Solution {
    public int subarraySum(int[] nums, int k) {
        int preSum = 0;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int n : nums){
            preSum += n;
            if(map.containsKey(preSum - k)){
                result += map.get(preSum - k);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return result;
    }
}