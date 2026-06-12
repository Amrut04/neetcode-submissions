class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String reverse = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reverse);
    }
}
