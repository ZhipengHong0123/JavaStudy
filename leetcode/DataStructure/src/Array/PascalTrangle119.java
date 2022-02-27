package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTrangle119 {
    public static void main(String[] args) {
        List<Integer> arr = getRow(3);
        System.out.println(arr);
    }

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0){
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            return arr;
        }

        List<Integer> prevrow = getRow(rowIndex-1);
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 1; i < rowIndex; i++) {
            arr.add(prevrow.get(i-1)+prevrow.get(i));
        }
        arr.add(1);
        return arr;
    }
}
