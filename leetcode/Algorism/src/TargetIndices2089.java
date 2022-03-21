import java.util.ArrayList;
import java.util.List;

public class TargetIndices2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int smallcount =0;
        int targetnum = 0;
        for (int num:nums){
            if (num == target){
                targetnum +=1;
            }else if (num < target){
                smallcount +=1;
            }
        }
        for (int i = 0; i < targetnum; i++) {
            result.add(smallcount + i);
        }
        return result;
    }
}
