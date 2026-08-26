class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength =0;
        Map<Integer,Boolean> mySet = new HashMap<>();

        for(int num : nums){
            mySet.put(num,Boolean.FALSE);
        }

        for(int i=0;i<nums.length;i++){
            int length =1;
            int nextNum = nums[i] + 1;
            while(mySet.containsKey(nextNum) && !mySet.get(nextNum)){
                length++;
                mySet.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int prev=nums[i]-1;
            while(mySet.containsKey(prev) && !mySet.get(prev)){
                length++;
                mySet.put(prev,Boolean.TRUE);
                prev--;
            }
            longestLength = Math.max(longestLength,length);

        }
        return longestLength;
    }
}
