class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int maxLeng = 0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(mySet.contains(s.charAt(right))){
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(s.charAt(right));
            maxLeng = Math.max(maxLeng,right-left+1);
        }
        return maxLeng;
    }
}
