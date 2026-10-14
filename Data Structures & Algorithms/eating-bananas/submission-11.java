class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=0;
        for(int p :piles){
            hi = Math.max(hi,p);
        }

    while(lo<hi){
        int mid = lo + (hi-lo)/2;
        long time=0;
        for(int p :piles){
            time += (p+mid-1)/mid;
        }
        if(time<=h)hi=mid;
        else lo = mid+1;
    }
    return lo;
    }
}
