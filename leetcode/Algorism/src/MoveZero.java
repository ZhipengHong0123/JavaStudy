import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {1,2,0,5,0,7,0,8,9};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
