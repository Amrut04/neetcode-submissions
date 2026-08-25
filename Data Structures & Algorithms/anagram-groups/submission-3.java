class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> maps = new HashMap<>();

        for(String s : strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            maps.putIfAbsent(key,new ArrayList<>());
            maps.get(key).add(s);
        }
        return new ArrayList<>(maps.values());
    }
}
