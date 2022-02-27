package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        List<Integer> lst = new ArrayList<>();

        for ( int num:nums){
            if (lst.contains(num)){
                lst.remove(new Integer(num)); //element
            }else {
                lst.add(num);
            }
        }

        return lst.get(0);
    }
}