class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> maps = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int comp = target - numbers[i];
            if(maps.containsKey(comp)){
                return new int[]{maps.get(comp)+1,i+1};
            }
            maps.put(numbers[i],i);
        }
        return new int[]{};
    }
}
