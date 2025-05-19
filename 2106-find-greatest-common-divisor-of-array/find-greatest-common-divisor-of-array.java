class Solution {
    private int max(int[] x){
        int temp = x[0];
        for (int i = 1; i < x.length; i++){
            temp = Math.max(temp, x[i]);
        }
        return temp;
    }
    private int min(int[] x){
        int temp = x[0];
        for (int i = 1; i < x.length; i++){
            temp = Math.min(temp, x[i]);
        }
        return temp;
    }
    public int findGCD(int[] nums) {
        int minNum = min(nums);
        int maxNum = max(nums);
        int gcm = 0;
        for (int i = 1; i <= maxNum; i++){
            if ((minNum % i == 0)&&(maxNum % i == 0)){
                gcm =  Math.max(gcm, i);
            }
        }
        return gcm;
    }
}