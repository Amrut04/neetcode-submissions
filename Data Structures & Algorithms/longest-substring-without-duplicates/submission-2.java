class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength =0;
        Set<Character> mySet = new HashSet<>();
        for(int i =0;i<s.length();i++){
            while(mySet.contains(s.charAt(i))){
                mySet.remove(s.charAt(left));
                left++;
            }

            mySet.add(s.charAt(i));
            maxLength = Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}
