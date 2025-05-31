class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if (s.lastIndexOf(" ")==-1){
            return s.length();
        }
        for (int i = 1; i < s.length(); i++){
            
            int len = s.lastIndexOf(" ");
            return (s.length()-len-1);
        }
        return 0;
    }
}