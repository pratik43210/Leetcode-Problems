class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int longest=1;
        int l=0,r=0;
        Map<Character,Integer> mpp=new HashMap<>();

        while(r<n){
            if(mpp.containsKey(s.charAt(r))) l=Math.max(l,mpp.get(s.charAt(r))+1);
            mpp.put(s.charAt(r),r);
            longest=Math.max(longest,r-l+1);
            r++;
        }
        return longest;
    }
}