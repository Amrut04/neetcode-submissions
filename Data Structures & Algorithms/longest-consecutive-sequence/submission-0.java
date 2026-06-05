class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer,Boolean> map = new HashMap<>();

        for(int num : nums){
            map.put(num,Boolean.FALSE);
        }

        for(int num : nums){
            int currentlength = 1;
            int nextNum = num +1;

            while(map.containsKey(nextNum) && map.get(nextNum) == Boolean.FALSE){
                currentlength++;
                 map.put(nextNum,Boolean.TRUE);
                 nextNum++;
        }

        int preNum = num -1;
        while(map.containsKey(preNum) && map.get(preNum) == Boolean.FALSE){
            currentlength++;
            map.put(preNum,Boolean.TRUE);
            preNum++;
    }
    longestLength = Math.max(longestLength,currentlength);
}
return longestLength;
    }
    }
