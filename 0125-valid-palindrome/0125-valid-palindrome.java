class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       String rev="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            rev=rev+ch;
        }
       }
       String c="";
       for(int i=rev.length()-1;i>=0;i--){
        c=c+rev.charAt(i);
       }
       return rev.equals(c);


    }
}