class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=0;
        int max =0;
        for(int pile:piles){
            max = Math.max(max,pile);
        }
        if(max==h){
            return max;
        }
        while(min<max){
            int mid = min + (max-min)/2;

            if(canEatInTime(piles,h,mid)){
                max = mid;
            }else{
                min = mid +1;
            }
        }
        return min;

        }
        public static boolean canEatInTime(int[] piles,int h,int speed){
            int hrs=0;
            for(int pile : piles){
                hrs += Math.ceil((double)pile/speed );
            }
            return hrs<=h;
        }
    }

