class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean has = false;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}