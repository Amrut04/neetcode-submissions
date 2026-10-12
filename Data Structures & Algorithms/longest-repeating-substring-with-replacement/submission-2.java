class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int[] freq = new int[26];
        int maxWindow = 0;
        int maxFreq = 0;

        for(int right=0;right<s.length();right++){
            freq[s.charAt(right) - 'A']++;
            int window = right - left +1;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right) - 'A']);
            if(window - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            window = right-left +1;
            maxWindow = Math.max(maxWindow,window);
        }
        return maxWindow;
    }
}
