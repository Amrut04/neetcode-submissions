class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        char[] stringArray = s.toCharArray();

        int left = 0;
        int right = stringArray.length -1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(stringArray[left])){
                left++;            }

            while(left<right && !Character.isLetterOrDigit(stringArray[right])){
                right--;
            }

            if(stringArray[left] != stringArray[right]){
                return false;
            }
            left++;
            right--;
        } 

        return true;
    }
}
