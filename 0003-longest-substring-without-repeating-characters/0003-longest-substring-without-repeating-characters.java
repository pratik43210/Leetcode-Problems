class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int longest=1;
        int l=0,r=0;
        Set<Character> st=new HashSet<>();

        while(r<n){
            if(st.contains(s.charAt(r))){
                while(l<r && st.contains(s.charAt(r))){
                    st.remove(s.charAt(l));
                    l++;
                }
            }
            st.add(s.charAt(r));
            longest=Math.max(longest,r-l+1);
            r++;
        }
        return longest;
    }
}