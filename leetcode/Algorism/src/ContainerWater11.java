public class ContainerWater11 {

    public static void main(String[] args) {
        int[] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {

        int left =0;
        int right = height.length-1;
        int maxarea=0;
        while (left < right){
            int area = Math.min(height[left] , height[right]) * Math.abs(left - right);
            maxarea = Math.max(area, maxarea);
            if (height[left] <= height[right]){
                left ++;
            }else {
                right--;
            }
        }
        return maxarea;
    }
}
