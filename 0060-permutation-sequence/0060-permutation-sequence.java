class Solution {
//     private void swap(char s[], int i, int j){
//         char c=s[i];
//         s[i]=s[j];
//         s[j]=c;
//     }
//     private void helper(char s[], int idx, ArrayList<String> res){
//         if(idx==s.length){
//             String str=new String(s);
//             res.add(str);
//         }
        
//         for(int i=idx;i<s.length;i++){
//             swap(s,i,idx);
//             helper(s, idx+1, res);
//             swap(s,i,idx);
//         }
//     }
    public String getPermutation(int n, int k) {
        // String s="";
        // ArrayList<String> res=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     s+=i;
        // }
        // helper(s.toCharArray(),0,res);
        // Collections.sort(res);
        // return res.get(k-1);
        int fact=1;
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1; i<n;i++){
            fact*=i;
            nums.add(i);
        }
        nums.add(n);
        String ans="";
        k=k-1;
        while(nums.size()!=0){
            ans=ans+nums.get(k/fact);
            nums.remove(k/fact);
            k=k%fact;
            if(nums.size()!=0) fact=fact/nums.size();
        }
        
        return ans;
    }
}