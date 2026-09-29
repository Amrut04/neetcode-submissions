class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left =i+1;
            int right = nums.length -1;

            while(left<right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum <0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return new ArrayList<>(result);
    }
}
