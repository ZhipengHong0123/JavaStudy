import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Set<Integer> set= new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = Math.max(i-k,0); j < i; j++) {
                if (Math.abs(nums[i]-nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
    }
}
