class Solution {
    public String reverseWords(String s) {
        //split string into an array words(use " " space as breakpoint)
        String[] str=s.split(" +");
        int i=0;
        int j=str.length-1;
        
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }

        //join the strings from str array with " " as separator string
        String reversed=String.join(" ",str).trim();

        return reversed;
    }
}