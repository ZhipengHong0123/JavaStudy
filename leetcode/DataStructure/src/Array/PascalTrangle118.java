package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTrangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> trangle = new ArrayList<List<Integer>>();

        trangle.add(new ArrayList<>());
        trangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevrow = trangle.get(i-1);
            for (int j = 1; j < i; j++) {
                row.add(prevrow.get(j)+prevrow.get(j-1));
            }
            row.add(1);
            trangle.add(row);
        }

        return trangle;
    }
}
