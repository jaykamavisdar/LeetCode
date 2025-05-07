class Solution {
    public boolean isPerfectSquare(int num) {
        if (num >= 4){
            int tHalf = num/2;
            for (int i = 1; i <= tHalf; i++){
                if (i*i == num){
                    return true;
                }
                else{
                    continue;
                }
            }
        }
        else if ((num==0)||(num==1)){
            return true;
        }
        return false;
    }
}