class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","").toString();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();

        return str.equals(rev);
    }
}
