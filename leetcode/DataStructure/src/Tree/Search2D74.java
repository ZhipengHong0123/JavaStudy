package Tree;

public class Search2D74 {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(mat,3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = c*r-1;
        while (left<= right){
            int pivot = left + (right-left)/2;
            int num = matrix[pivot/c][pivot%c];
            if (num == target){
                return true;
            }
            if (num < target){
                left = pivot +1;
            }else {
                right = pivot -1;
            }
        }
        return false;
    }
}
