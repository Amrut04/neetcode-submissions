class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int miss=1;
        for(int num : nums)
        if(num>0 && miss==num){
            miss++;
        }
        return miss;
    }
}