class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> res = new ArrayList<>();

        while(i<str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            String strs = str.substring(j+1,j+1+length);

            i = j+1+length;
            res.add(strs);
                  
        }
          return res;
    }
}
