import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] s= {'a','e','i','o','u'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int pivot = s.length/2;
        for (int i = 0; i < pivot+1; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-i-1] = temp;
        }
    }
}