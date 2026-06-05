class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

       Map<String,Integer> map = new HashMap<String,Integer>();

       for(char c:s.toCharArray()){
        map.put(c,map.getorDefault(c,0)+1);
       }

       for(char c:t.toCharArray()){
        if(!map.containsKey(c)) return false;

        map.put(c,map.get(c) -1);

        if(map.get(c) == 0){
            map.remove(c);
        }
       }
        return map.isEmpty();

    }
}
