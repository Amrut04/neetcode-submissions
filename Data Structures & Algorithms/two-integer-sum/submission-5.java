class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(myMap.containsKey(temp)){
                return new int[]{myMap.get(temp),i};
            }
            myMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
