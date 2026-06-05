class Solution {
    public boolean isAnagram(String s, String t) {
        String a = '';

        for (int i = s.length() -1 ; i<0;i--){
            a += s.charAt(i);
        }

        if(t.equals(s)){
            return true;
        }

        return false;
    }
}
