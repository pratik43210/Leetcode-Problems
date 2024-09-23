class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;

        int longest = 0;
        int lastSmallest = Integer.MIN_VALUE;
        int cnt=0;
        
        Arrays.sort(a);
        
        for(int i=0;i<n;i++){
            if(a[i]-1==lastSmallest){
                cnt++;
                lastSmallest=a[i];
            }else if(lastSmallest!=a[i]){
                cnt=1;
                lastSmallest=a[i];
            }
            longest=Math.max(cnt,longest);
        }
        
        return longest;
    }
}