class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(s.indexOf(sch)!=t.indexOf(tch)){
                return false;
            }
            

        }
        return true;
        
    }
}