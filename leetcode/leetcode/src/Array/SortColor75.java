package Array;

public class SortColor75 {
    public void sortColors(int[] nums) {
        int lo=0 , curr =0;
        int hi=nums.length-1;
        int temp;

        while (curr <= hi){
            if (nums[curr] == 0 ){
                temp = nums[curr];
                nums[curr++] = nums[lo];
                nums[lo++] =temp;

            }else if (nums[curr] ==2){
                temp = nums[curr];
                nums[curr] = nums[hi];
                nums[hi--] = temp;

            }else curr++;
        }
    }
}
