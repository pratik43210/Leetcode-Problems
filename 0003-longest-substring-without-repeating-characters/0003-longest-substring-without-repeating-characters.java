class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int longest=1;
        int i=0,j=0;
        Set<Character> st=new HashSet<>();

        while(j<n){
            if(st.contains(s.charAt(j))){
                longest=Math.max(longest,j-i);
                st.clear();
                i++;
                j=i;
            }else if(j==n-1){
                longest=Math.max(longest,j-i+1);
            }
            st.add(s.charAt(j));
            j++;            
        }
        return longest;
    }
}