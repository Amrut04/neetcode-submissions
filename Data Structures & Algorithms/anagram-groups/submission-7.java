class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> maps = new HashMap<>();

        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);

            String key = new String(sArray);
            maps.putIfAbsent(key,new ArrayList<>());
            maps.get(key).add(s);
        }
        return new ArrayList(maps.values());
    }
}
