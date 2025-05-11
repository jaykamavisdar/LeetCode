class Solution {
    public int countOdds(int low, int high) {
        // int count = 0;
        // for (int i = low; i <= high; i++){
        //     if (i%2 != 0){
        //         count++;
        //     }
        // }
        // return count;

        int oddBLow = low/2;            //odd number between 1 and low-1
        int oddBHigh = (high + 1) / 2;  //odd number between 1 and high

        return oddBHigh - oddBLow;
    }
}