class Solution {
    public boolean checkPerfectNumber(int num) {
        int numCheck = 0;
        for (int i = 1; i <= (num/2); i++){
            if (num%i==0){
                numCheck += i;
            }
            else{
                continue;
            }
        }
        if (numCheck == num){
            return true;
        }
        return false;
    }
}