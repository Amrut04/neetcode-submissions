class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^0-9a-z]","");
        StringBuilder sc = new StringBuilder(str);
        String revStr = sc.reverse().toString();

        return revStr.equals(str);
    }
}
