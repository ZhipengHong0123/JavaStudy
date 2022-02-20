package Array;

import java.util.*;

public class MergeSortedArray88 {

    public static void main(String[] args) {
        int[] nums1={4,5,6,0,0,0};
        int[] nums2={1,2,3};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] Copynum1=new int[m];
        for (int i = 0; i < m; i++) {
            Copynum1[i]=nums1[i];
        }

        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < n+m; i++) {
            if ( p2 >=n||( p1 < m && nums1[p1] < nums2[p2])){
                nums1[i]=Copynum1[p1++];
            }else {
                nums1[i]= nums2[p2++];
            }
        }
    }
}
