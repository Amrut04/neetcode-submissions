class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();

       for(String values : strs){
        char[] s = values.toCharArray();

        Arrays.sort(s);
        String key = new String(s);

        map.putIfAbsent(key,new ArrayList<String>());
        map.get(key).add(values);
       }

       return new ArrayList<>(map.values());
    }
}
