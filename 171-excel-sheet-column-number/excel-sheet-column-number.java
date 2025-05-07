class Solution {
    public int titleToNumber(String columnTitle) {
        int convert = 0;
        int cNum = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            convert = columnTitle.charAt(i)-64;
            cNum += convert * Math.pow(26, columnTitle.length() - 1 - i);
        }
        return cNum;
    }
}