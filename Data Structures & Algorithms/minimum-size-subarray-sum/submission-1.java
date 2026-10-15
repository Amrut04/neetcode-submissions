class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int maxWindow = Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int currentSum=0;

        while(right<nums.length){
            currentSum += nums[right];
            right++;
            while(currentSum >= target){
                int window = right-left;
                maxWindow = Math.min(maxWindow,window);
                currentSum -= nums[left];
                left++;
            }
        }
        return maxWindow == Integer.MAX_VALUE ? 0 : maxWindow;
    }
}