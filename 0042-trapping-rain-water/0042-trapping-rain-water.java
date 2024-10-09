class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int total=0;
        
        int lmax=0,rmax=0;
        int l=0,r=n-1;
        
        while(l<r){
            if(height[l]<=height[r]){
                if(height[l]>=lmax){
                    lmax=height[l];
                }else{
                    total+=lmax-height[l];
                }
                l++;
            }else{
                if(height[r]>=rmax){
                    rmax=height[r];
                }else{
                    total+=rmax-height[r];
                }
                r--;
            }
        }
        
        return total;
    }
}