class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char a : sArray){
            map1.put(a,map1.getOrDefault(a,0)+1);
        }
          for(char a : tArray){
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        else 
        return false;
    }
}
