package Array;

import java.util.*;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        int n = nums.length;
        for (int num : nums) {
            if (dict.containsKey(num)) {
                dict.put(num, dict.get(num) + 1);
            } else {
                dict.put(num, 1);
            }
        }
        int max = 0;
        int maxcount = 0;
        for (Integer num : dict.keySet()) {
            if (dict.get(num) > maxcount) {
                max = num;
                maxcount = dict.get(num);
            }
        }
        return max;
    }

    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
