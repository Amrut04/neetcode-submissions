class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int right = 0;
        int currentSum = 0;
        int minWindow = Integer.MAX_VALUE;

        while(right<nums.length){
            currentSum += nums[right];
            right++;
            while(currentSum >= target){
                int window = right -left;
                minWindow = Math.min(minWindow,window);

                currentSum -= nums[left];
                left++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}