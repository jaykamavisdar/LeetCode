class Solution {
    private void swap(int[] nums, int start, int end){      //To reverse or swap the elements
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;      //If k becomes more than n... it handles the loop
        swap(nums, 0, n-1);     //Swap the entire array
        swap(nums, 0, k-1);     //Swap the first k elements to make them in original order
        swap(nums, k, n-1);     //Swap the rest elements to make them in original order
    }
}