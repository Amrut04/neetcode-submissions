class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] as = s.toCharArray();
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(as[left])){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(as[right])){
                right--;
            }

            if(as[left] != as[right]){
                return false;
            }
           left++;
           right--;
        }
        return true;
    }
}
