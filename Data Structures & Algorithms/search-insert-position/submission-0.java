class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int sum = left + (right-left)/2;
            if(nums[sum] == target){
                return sum;
            }else if(nums[sum] < target){
                left++;
            }else{
                right--;
            }
        }
        return left;
    }
}