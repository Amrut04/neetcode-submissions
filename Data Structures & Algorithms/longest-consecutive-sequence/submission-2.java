class Solution {
    public int longestConsecutive(int[] nums) {
       int longestLength = 0;
       Map<Integer,Boolean> map = new HashMap<>();

       for(int num : nums){
        map.put(num,Boolean.FALSE);
       }

       for(int num : nums){
        int currentLength = 1;
        int nextNum = num +1;

        while(map.containsKey(nextNum) && !map.get(nextNum)){
            currentLength++;
            map.put(nextNum,Boolean.TRUE);
            nextNum++;
        }

        int prev = num -1;
        while(map.containsKey(prev) && !map.get(prev)){
            currentLength++;
            map.put(prev,Boolean.TRUE);
            prev--;
        }

        longestLength = Math.max(currentLength,longestLength);
       }
       return longestLength;
    }
}
