import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public int removeDuplicates(int[] nums) {
    Set<Integer> Set = new LinkedHashSet<>();
    for(int num : nums){
        Set.add(num);
    }
    int i =0;
    for(int num : Set){
        nums[i++]= num;
    }
    return Set.size();
    }
}