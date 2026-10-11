class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(myMap.containsKey(comp)){
                return new int[]{myMap.get(comp),i};
            }
            myMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
