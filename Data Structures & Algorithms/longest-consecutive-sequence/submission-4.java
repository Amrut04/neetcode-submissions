class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        Arrays.sort(nums);
        Map<Integer,Boolean> map = new HashMap<>();

        for(int i : nums){
            map.put(i,Boolean.FALSE);
        }

        for(int i=0;i<nums.length;i++){
            int nextNum = nums[i]+1;
            int length = 1;

            while(map.containsKey(nextNum) && !map.get(nextNum)){
               length++;
               map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int prev = nums[i] -1;
            while(map.containsKey(prev) && !map.get(prev)){
                length++;
                map.put(prev,Boolean.TRUE);
                prev--;
            }
            longestLength = Math.max(longestLength,length);
        }
        return longestLength;
    }
}
