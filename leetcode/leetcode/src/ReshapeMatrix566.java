import com.sun.source.tree.BreakTree;

import java.util.LinkedList;

public class ReshapeMatrix566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        if (mat.length == 0 || r * c != mat.length * mat[0].length) {
            return mat;
        }
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                lst.add(mat[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = lst.remove();
            }
        }
        return res;
    }

    public int[][] matrixReshape1(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        if (mat.length == 0 || r * c != mat.length * mat[0].length) {
            return mat;
        }
        int col = 0, row = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[col][row] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }

    public int[][] matrixReshape2(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        if (mat.length == 0 || r * c != mat.length * mat[0].length) {
            return mat;
        }
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[count / c][count % c] = mat[i][j];
            }
        }
        return res;
    }
}
