public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if (target>nums[right]){
            return nums.length;
        } else if (target < nums[left]){
            return 0;
        }
        while (left <= right){
            int pivot = left + (right -left)/2;
            if (nums[pivot] == target){
                return pivot;
            }
            if (nums[pivot] > target){
                right = pivot-1;
            } else {
                left = pivot +1;
            }
        }
        return left;
    }
}
