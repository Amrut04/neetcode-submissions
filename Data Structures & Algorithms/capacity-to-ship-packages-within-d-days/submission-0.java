class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = 0;
        int hi = 0;

        for(int i=0;i<weights.length;i++){
            lo = Math.max(lo,weights[i]);
            hi += weights[i];
        }

        while(lo<hi){
            int day =1,sum=0;
            int mid = lo + (hi - lo)/2;
            for(int w : weights){
                if(sum + w > mid){
                day++;
                sum=0;
                }
                sum += w;
            }
            if(day > days){
               lo = mid+1;
            }else{
                 hi = mid;
            }
        }
        return lo;
    }
}