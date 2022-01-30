import java.util.Arrays;
import java.util.HashMap;

public class containsduplicate217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> imap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (imap.containsKey(nums[i])){
                return true;
            }else {
                imap.put(nums[i],i);
            }
        }
        return false;
    }
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
}
