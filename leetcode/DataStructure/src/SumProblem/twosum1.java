package SumProblem;

import java.util.Arrays;
import java.util.HashMap;

public class twosum1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] a= twoSum(nums,9);
        System.out.println(Arrays.toString(a));;

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> imap= new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer res=target-nums[i];

            if(imap.containsKey(res)){
                int[] result={i,imap.get(res)};
                return  result;
            }

            imap.put(nums[i],i);
        }
        return null;
    }
}
