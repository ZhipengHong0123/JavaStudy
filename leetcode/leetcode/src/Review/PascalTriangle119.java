package Review;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0 ){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }
        List<Integer> prev = getRow(rowIndex-1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <rowIndex ; i++) {
            row.add(prev.get(i)+prev.get(i-1));
        }
        row.add(1);
        return row;
    }
}
