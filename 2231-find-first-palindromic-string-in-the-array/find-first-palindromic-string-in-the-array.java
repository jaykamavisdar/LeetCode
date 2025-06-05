class Solution {
    private Boolean palindrome(String s){
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) return true;
        else return false;
    }
    public String firstPalindrome(String[] words) {
        for (String i : words){
            if (palindrome(i)) return i;
        }
        return "";
    }
}