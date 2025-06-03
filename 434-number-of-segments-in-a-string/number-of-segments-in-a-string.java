class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        String[] arr = s.split("\\s+");     //Regex operator that checks \t or \n or spaces and + checks for 1 or more of them
        return arr.length;
    }
}