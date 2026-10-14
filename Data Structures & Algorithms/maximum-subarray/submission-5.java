class Solution {
    public int maxSubArray(int[] nums) {
        int sum = -1;
        int maxSUm = -1;

        for(int n : nums){
            sum = Math.max(n,sum+n);
            maxSUm = Math.max(sum,maxSUm);
        }
        return maxSUm;
    }
}
