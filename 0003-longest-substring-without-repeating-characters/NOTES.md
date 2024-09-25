Time Complexity: O( N2 )
​
Space Complexity: O(N) where N is the size of HashSet taken for storing the elements
​
**Better Approach**
​
class Solution {
public int lengthOfLongestSubstring(String s) {
int n=s.length();
if(n==0) return 0;
int longest=1;
int l=0,r=0;
Set<Character> st=new HashSet<>();
​
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
​
**Explanation**
The solution uses a sliding window technique with two pointers (l and r) to find the longest substring without repeating characters. As r moves through the string, a set tracks unique characters within the current window. If a duplicate is encountered, the left pointer (l) is moved right, removing characters from the set until the duplicate is resolved. The length of the window (r - l + 1) is updated each time a new character is added. This approach ensures that each character is processed at most twice, resulting in a time complexity of O(n) and an efficient search for the longest substring without repeats.
​
Time Complexity: O( 2*N ) (sometimes left and right both have to travel complete array)
​
Space Complexity: O(N) where N is the size of HashSet taken for storing the elements