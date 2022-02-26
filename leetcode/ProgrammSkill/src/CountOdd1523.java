public class CountOdd1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(8, 10));
    }
    public static int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 ==0){
            count++;
            low++;
        }
        while (low<=high){
            low +=2;
            count++;
        }
        return count;
    }
}
