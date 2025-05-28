import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for (int i : nums){
        //     int c = 0;
        //     for (int j : nums){
        //         if (i == j){
        //             c++;
        //             if (c == 2) return true;
        //         }
        //     }
        // }
        // return false;      

        //Using HashSet

        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}