
public class RotatedSortedArray33 {
    public static void main(String[] args) {
        int[] nums = {8,9,2,3,4};
        System.out.println(search(nums,9));

    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right)/2;
            if (nums[mid] > nums[right]){
                left = mid +1;
            }else {
                right = mid;
            }
        }
        int idx = left;


        if (nums[idx] == target) {
            return idx;
        }
        if (idx ==0){
            left = 0 ;
            right = nums.length-1;
        } else if (target < nums[0]) {
            left = idx;
            right = nums.length - 1;
        } else {
            left = 0;
            right = idx - 1;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
