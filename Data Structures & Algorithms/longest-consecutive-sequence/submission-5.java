class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength =0;
        Map<Integer,Boolean> maps = new HashMap<>();

        for(int n : nums){
            maps.put(n,Boolean.FALSE);
        }
        for(int i=0;i<nums.length;i++){
            int nextNum = nums[i] +1;
            int length = 1;
            while(maps.containsKey(nextNum) && !maps.get(nextNum)){
                length++;
                maps.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int prev = nums[i] -1;
            while(maps.containsKey(prev) && !maps.get(prev)){
                length++;
                maps.put(nextNum,Boolean.TRUE);
                prev--;
            }

            longestLength = Math.max(longestLength,length);
        }
        return longestLength;
    }
}
