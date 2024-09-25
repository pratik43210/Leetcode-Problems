class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int cnt=0;
        int longest=1;

        for(int i=0;i<n;i++){
            Set<Character> st=new HashSet<>();
            for(int j=i;j<n;j++){
                if(st.contains(s.charAt(j))){
                    longest=Math.max(longest,j-i);
                    break;
                }else if(j==n-1){
                    longest=Math.max(longest,j-i+1);
                }
                st.add(s.charAt(j));
            }
        }
        return longest;
    }
}