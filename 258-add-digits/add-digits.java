class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; //gets and adds last number
                num /= 10;  //removes the last number from num to change last number to be added
            }
            num = sum;
        }
        return num;
    }
}