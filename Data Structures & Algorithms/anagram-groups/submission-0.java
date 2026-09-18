class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] c = s.toCharArray();

            Arrays.sort(c);
            String key = new String(c);

            list.putIfAbsent(key,new ArrayList<>());
            list.get(key).add(s);
            
        }
        return new ArrayList<>(list.values());
    }
}
