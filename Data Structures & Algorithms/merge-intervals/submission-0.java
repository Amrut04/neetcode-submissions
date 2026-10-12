class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] -b[0]);

        List<int[]> result = new ArrayList<>();
        for(int[] inter : intervals){
            if(result.isEmpty() || result.get(result.size() -1)[1] < inter[0]){
                result.add(inter);
            }else{
                int index = result.size() -1;
                result.get(index)[1] = Math.max(result.get(index)[1],inter[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
