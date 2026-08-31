class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        int lonLent =  0;
        for(int i : nums){
            map.put(i,Boolean.FALSE);
        }
        for(int i=0;i<nums.length;i++){
            int nextNum = nums[i] +1;
            int len = 1;
            while(map.containsKey(nextNum) && !map.get(nextNum)){
                len++;
                map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            int prev = nums[i] -1;
            while(map.containsKey(prev) && !map.get(prev)){
                len++;
                map.put(prev,Boolean.TRUE);
                prev--;
            }
            lonLent = Math.max(len,lonLent);
        }
        return lonLent;
    }
}
