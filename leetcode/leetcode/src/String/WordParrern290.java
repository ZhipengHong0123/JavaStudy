package String;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class WordParrern290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap t1 = new HashMap();
        String[] sa = s.split(" ");
        if (sa.length != pattern.length()){
            return false;
        }
        for (Integer i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = sa[i];

            if (!t1.containsKey(c)) {
                t1.put(c,i);
            }
            if (!t1.containsKey(w)){
                t1.put(w,i);
            }
            if (t1.get(w) != t1.get(c)){
                return false;
            }

        }
        return true;
    }
}
