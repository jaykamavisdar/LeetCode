class Solution {
    private int findFirst(int[] x, int y){
        for(int i = 0; i < x.length; i++){
            if (x[i] == y){
                return i;
            }
        }
        return -1;
    }
    private int findLast(int[] x, int y){
        for (int i = x.length -1; i >= 0; i--){
            if (x[i] == y){
                return i;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[2];
        index[0] = findFirst(nums, target);
        index[1] = findLast(nums, target);
        return index;
    }
}