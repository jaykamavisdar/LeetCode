class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++){      //Loop to check if target is in nums
            if (nums[i]==target){
                flag = 1;
                return i;
            }
        }
        if (flag == 0){
            if (nums.length == 1){      //Condition if nums has only 1 element
                if (nums[0]>target){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            for (int i = 0; i < nums.length-1; i++){        //Loop If target is not in nums and not if nums has only 1 element as it will go out of bound...
                if ((nums[i]<target)&&(nums[i+1]>target)){
                    return i+1;
                }
                else if(nums[nums.length-1]<target){        //If the target is in end of nums as the loop will skip that term.
                    return (nums.length);
                }
            }
        }
        return 0;
    }
}