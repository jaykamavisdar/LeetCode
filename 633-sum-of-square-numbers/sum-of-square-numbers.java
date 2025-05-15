class Solution {
    public boolean judgeSquareSum(int c) {
        // if (c == 1 || c == 0) return true;
        // for (int i = 0; i <= c/2; i++){
        //     for (int j = 0; j <= c/2; j++){
        //         if (Math.pow(i,2)+Math.pow(j,2) == c) return true;
        //     }
        // }
        // return false;

        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            long current = left * left + right * right;
            if (current == c) {
                return true;
            } else if (current < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}