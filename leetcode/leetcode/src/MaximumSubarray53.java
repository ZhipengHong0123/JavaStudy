public class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int arraysum = nums[0];
        int maxsum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            arraysum=Math.max(nums[i],arraysum+nums[i]);
            maxsum=Math.max(maxsum,arraysum);
        }
        return maxsum;
    }
    public static int maxSubArray1(int[] nums){
        int sum=nums[0];
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum+=nums[i];
            max=Math.max(sum,max);
            if (sum < 0){
                sum=0;
            }
        }
        return max;
    }
}
