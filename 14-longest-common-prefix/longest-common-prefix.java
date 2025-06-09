class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String fStr = strs[0];

        for (int i = 0; i < fStr.length(); i++){
            char ch = fStr.charAt(i);
            for (int j = 0; j < strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) return prefix;
            }
            prefix = prefix + ch;
        }
        return prefix;
    }
}