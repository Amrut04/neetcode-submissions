class Solution {
    public int singleNumber(int[] nums) {
        int n =0;
        for(int n1 : nums){
            n ^= n1;
        }
        return n;
    }
}
