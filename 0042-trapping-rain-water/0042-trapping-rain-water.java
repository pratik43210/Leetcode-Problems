class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int total=0;
        
        int[] prefixMax=new int[n];
        int[] suffixMax=new int[n];
        prefixMax[0]=height[0];
        suffixMax[n-1]=height[n-1];
        
        for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
            suffixMax[n-i-1]=Math.max(suffixMax[n-i],height[n-i-1]);
        }
        
        for(int i=0;i<n;i++){
            int leftMax=prefixMax[i];
            int rightMax=suffixMax[i];
            
            if(height[i]<leftMax && height[i]<rightMax){
                total+=Math.min(leftMax,rightMax)-height[i];
            }
        }
        
        return total;
    }
}