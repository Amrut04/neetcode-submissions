class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> maps = new HashMap<>();
        int longLen =0;
        for(int i:nums){
            maps.put(i,Boolean.FALSE);
        }
        for(int i=0;i<nums.length;i++){
            int nextNum = nums[i] +1;
            int length=1;
            while(maps.containsKey(nextNum) && !maps.get(nextNum)){
                length++;
                maps.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int prev = nums[i] -1;
            while(maps.containsKey(prev) && !maps.get(prev)){
                length++;
                maps.put(prev,Boolean.TRUE);
                prev--;
            }

            longLen = Math.max(longLen,length);
        }
        return longLen;
    }
}
