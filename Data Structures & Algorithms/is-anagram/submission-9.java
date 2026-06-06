class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        boolean result = false;
        for(int i=0;i<s.length();i++){
            if(sArray[i] == tArray[i]){
                result = true;
             }else{
            return false;
            }
        }
        return result;
    }
}
