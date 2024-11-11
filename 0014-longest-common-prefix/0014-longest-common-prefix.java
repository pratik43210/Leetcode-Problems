class Solution {
    public String longestCommonPrefix(String[] strs) {
        //we will assume the first string in strs to be the prefix
        String prefix=strs[0];
        
        //in the loop we wil showly move to a smaller substring
        //by executing prefix.substring(0,prefix.length()-1)
        //in the end there will be empty substring if no prefix exists
        //we will loop through the remaining elements of the array
        for(int i=1;i<strs.length;i++){
            //we will keep reducing substring until indexOf(prefix)=0
            //that would be our answer
            while(strs[i].indexOf(prefix)!=0){
                //shorten the prefix until it matches
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        
        //return the prefix
        return prefix;
    }
}