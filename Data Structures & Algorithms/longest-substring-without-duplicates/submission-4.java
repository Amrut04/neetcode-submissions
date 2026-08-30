class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longLen =0;
        int left=0;
        Set<Character> mySet = new HashSet<>();
        for(int i =0;i<s.length();i++){
            while(mySet.contains(s.charAt(i))){
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(s.charAt(i));
            longLen = Math.max(longLen,i-left + 1);
        }
        return longLen;
    }
}
