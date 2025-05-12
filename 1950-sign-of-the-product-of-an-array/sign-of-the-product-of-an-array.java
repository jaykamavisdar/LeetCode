class Solution {
    private int signFunc(int x){
        if (x > 0) return 1;
        else if (x == 0) return 0;
        else return -1;
    }
    public int arraySign(int[] nums) {
        // int product = 1;
        // for (int i = 0; i < nums.length; i++){
        //     if (nums[i] == 0){
        //         return 0;
        //     }
        //     product *= nums[i];
        // }
        // return signFunc(product);
        int sign = 1;
        for (int num : nums){
            if (num == 0){
                return 0;
            }
            if (num < 0){
                sign = -sign;
            }
        }
        return signFunc(sign);
    }
}