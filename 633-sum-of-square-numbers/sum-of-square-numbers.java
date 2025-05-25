class Solution {
    // private boolean perfectSquare(int x){
    //     if (x >= 4){
    //         int tHalf = x/2;
    //         for (int i = 1; i <= tHalf; i++){
    //             if (i*i == x){
    //                 return true;
    //             }
    //             else{
    //                 continue;
    //             }
    //         }
    //     }
    //     else if ((x==0)||(x==1)){
    //         return true;
    //     }
    //     return false;
    // }
    public boolean judgeSquareSum(int c) {
        // if (perfectSquare(c)) return true;
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