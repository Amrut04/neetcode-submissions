class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        return Math.max(nums[0],
        Math.max(helper(Arrays.copyOfRange(nums,0,nums.length-1)),
        helper(Arrays.copyOfRange(nums,1,nums.length))));
    }

    private int helper(int[] nums){

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        
        int[] loot = new int[nums.length];
        loot[0] = nums[0];
        loot[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            loot[i] = Math.max(loot[i-2]+nums[i],loot[i-1]);
        }
        return loot[nums.length-1];
    }
}
