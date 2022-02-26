package String;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels763 {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        int j = 0;
        int anchor=0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            j=Math.max(j,last[s.charAt(i)-'a']);
            if (i==j){
                res.add(i-anchor+1);
                anchor = i+1;
            }
        }
        return res;
    }
}
