class Solution {
    public boolean checkPerfectNumber(int num) {
        int numCheck = 0;
        for (int i = 1; i < num; i++){
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