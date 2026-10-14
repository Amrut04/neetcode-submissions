class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> mySet = new HashSet<>();
        int maxLeng = 0;

        for(int r=0;r<s.length();r++){
            while(mySet.contains(s.charAt(r))){
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(s.charAt(r));
            maxLeng = Math.max(maxLeng,r-left+1);
        }
        return maxLeng;
    }
}
