class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n=a.length(),m=b.length();
        //a should repeat atlest a min number of times so that length
        //of a>=length of b
        //we can get that by m/n but we might get rounded down value
        //if m is not a exact multiple of n
        //so we pweform ceiling division by adding n-1, -1 accounts
        //for when m is exact multiple of n
        int minRepeats=(m+n-1)/n;
        
        // Create a string by repeating 'a' the minimum required number of times
        String repeatedA = a.repeat(minRepeats);
        
        // Check if b is a substring of repeatedA
        if (repeatedA.contains(b)) return minRepeats;

        // Repeat a one more time and check again
        repeatedA += a;
        if (repeatedA.contains(b)) return minRepeats + 1;

        // If not found, return -1
        return -1;
    }
}