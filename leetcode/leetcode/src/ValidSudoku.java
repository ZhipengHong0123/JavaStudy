import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxs = new HashSet[N];

        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];
                if (val=='.'){
                    continue;
                }
                if (rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                if (cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                int idx = c/3 + (r/3)*3;
                if (boxs[idx].contains(val)) return false;
                boxs[idx].add(val);


            }
        }
        return true;
    }
}
