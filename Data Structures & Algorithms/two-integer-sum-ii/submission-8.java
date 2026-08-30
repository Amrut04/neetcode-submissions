class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> maps = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int comp = target - numbers[i];
            if(maps.containsKey(comp)){
                return new int[]{maps.get(comp),i+1};
            }

            maps.put(numbers[i],i+1);
        }
        return new int[]{};
    }
}
