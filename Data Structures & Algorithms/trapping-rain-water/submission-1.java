class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax = height[0];
        int rmax = height[height.length -1];

        int trapped = 0;
        while(i<=j){
            lmax = Math.max(lmax,height[i]);
            rmax = Math.max(rmax,height[j]);

            if(lmax<rmax){
                trapped += lmax - height[i];
                i++; 
            }else{
                trapped += rmax - height[j];
                j--;
            }     
        }
        return trapped;
    }
}
