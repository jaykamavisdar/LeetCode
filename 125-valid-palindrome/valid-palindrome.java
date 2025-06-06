class Solution {
    private String removeN(String x){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        x = x.toUpperCase();
        String stripped = "";
        for (int i = 0; i < x.length(); i++){
            if (alpha.indexOf(x.charAt(i)) != -1){
                stripped = stripped + x.charAt(i);
            }
        }
        return stripped;
    }
    public boolean isPalindrome(String s) {
        String str = removeN(s);
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) return true;
        else return false;
    }
}