package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays350 {
    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={4,9,9,8,4};
        System.out.println(Arrays.toString(intersect(num2, num1)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> imap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (imap.containsKey(nums1[i])){
                imap.put(nums1[i],imap.get(nums1[i])+1);
            }else {
                imap.put(nums1[i],1);
            }
        }
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (imap.containsKey(nums2[i]) && imap.get(nums2[i])>=1) {
                imap.put(nums2[i],imap.get(nums2[i])-1);
                arr.add(nums2[i]);
            }
        }
        int[] result =new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
