class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> maps = new HashMap<>();
        int longLen = 0;
        for(int n : nums){
            maps.put(n,Boolean.FALSE);
        }

        for(int i=0;i<nums.length;i++){
            int len =1;
            int nextNum = nums[i]+1;
            while(maps.containsKey(nextNum) && !maps.get(nextNum)){
                len++;
                maps.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int prev=nums[i] -1;
            while(maps.containsKey(prev) && !maps.get(prev)){
                len++;
                maps.put(nextNum,Boolean.TRUE);
                prev--;
            }
            longLen = Math.max(len,longLen);
        }
        return longLen;
    }
}
