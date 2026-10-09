class Solution {
    public int findMin(int[] nums) {
       //return Arrays.stream(nums).min().getAsInt();
       Arrays.sort(nums);
       return nums[0];
    }
}
