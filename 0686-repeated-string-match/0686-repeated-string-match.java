class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n=a.length(),m=b.length();
        
        int minRepeats=(m+n-1)/n;
        
        String repeatedA=a.repeat(minRepeats);
        
        if(repeatedA.contains(b)) return minRepeats;
        
        repeatedA+=a;
        
        if(repeatedA.contains(b)) return minRepeats+1;
        
        return -1;
    }
}