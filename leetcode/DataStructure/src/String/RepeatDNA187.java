package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatDNA187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, n = s.length();

        HashSet<String> seen = new HashSet<>(), result = new HashSet<>();
        for (int i = 0; i < n - L + 1; i++) {
            String temp = s.substring(i, i + L);
            if (seen.contains(temp)) {
                result.add(temp);
            }else {
                seen.add(temp);
            }
        }
        return new ArrayList(result);
    }
}
