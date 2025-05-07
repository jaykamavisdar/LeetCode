class Solution {
    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        else{
            while (n >= 7) {
                int sum = 0;
                while (n > 0) {
                    sum += (n % 10)*(n % 10); //gets and adds last number
                    n /= 10;  //removes the last number from num to change last number to be added
                }
                n = sum;
                if (n == 1){
                    return true;
                }
            }
            return false;
        }
    }
}