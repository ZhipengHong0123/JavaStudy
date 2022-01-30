import java.util.Arrays;
import java.util.HashMap;

public class TwoSum167 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,11,15};
        int[] result = twoSum(nums,9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int res = target - numbers[i];
            if (map.containsKey(res)){
                return new int[]{map.get(res)+1, i + 1};
            }
            map.put(numbers[i],i);
        }
        return null;
    }
    public static int[] twoSum1(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        while (low<high){
            int sum = numbers[low] + numbers[high];
            if (sum==target){
                return new int[]{low+1,high+1};
            }else if (sum>target){
                high--;
            }else {
                low--;
            }
        }
        return null;
    }
}