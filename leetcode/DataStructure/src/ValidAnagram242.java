import java.util.Arrays;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);

        return Arrays.equals(arrs, arrt);
    }

    public boolean isAnagram1(String s, String t) {
        int[] word = new int[26];
        for (int i = 0; i < s.length(); i++) word[s.charAt(i)-'a']++;
        for (int i = 0; i < t.length(); i++) word[s.charAt(i)-'a']--;
        for (int i = 0; i < word.length; i++) if (word[i]!=0) return false;
        return true;
    }
}