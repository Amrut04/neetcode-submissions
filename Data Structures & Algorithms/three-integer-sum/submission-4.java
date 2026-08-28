class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> mySet = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum==0){
                    mySet.add(Arrays.asList(nums[left],nums[right],nums[i]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }
                else{
                    right --;
                }
            }
        }
        return new ArrayList<>(mySet);
    }
}
