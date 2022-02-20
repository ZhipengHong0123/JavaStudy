package SumProblem;

import java.util.HashMap;

public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int res = target - numbers[i];
            if (hmap.containsKey(res)){
                int[] result = {i,hmap.get(res)};
                return result;
            }
            hmap.put(numbers[i],i);
        }
        return null;
    }
}
