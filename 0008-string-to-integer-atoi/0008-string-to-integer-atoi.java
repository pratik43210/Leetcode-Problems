class Solution {
    public int myAtoi(String s) {
        int max_val=Integer.MAX_VALUE;
        int min_val=Integer.MIN_VALUE;
        
        s=s.trim();
        
        if(s.isEmpty()) return 0;
        
        int i=0,sign=1;
        
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        
        int num=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int current=s.charAt(i)-'0';
            
            //num*10+current>max_val means overflow/onderflow of int value
            if(num>(max_val-current)/10){
                num=sign==1?max_val:min_val;
                return num;
            }
            
            num=num*10+current;
            i++;
        }
        
        return num*sign;
    }
}