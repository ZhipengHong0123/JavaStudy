import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c: ransomNote.toCharArray()){
            int index = magazine.indexOf(c);
            if (index == -1){
                return false;
            }else {
                magazine=magazine.substring(0,index)+magazine.substring(index+1);
            }
        }
        return true;
    }
    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length()<magazine.length()){
            return false;
        }
        Map<Character,Integer> ransomNoteCounts = makeCountsMap(ransomNote);
        Map<Character,Integer> magazineCounts = makeCountsMap(magazine);
        for (char c : ransomNoteCounts.keySet()) {
            if (ransomNoteCounts.get(c) <= magazineCounts.get(c)){
                continue;
            }else {
                return false;
            }
        }
        return true;

    }
    private Map<Character,Integer> makeCountsMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c,0);
            map.put(c,count);
        }
        return map;
    }
    public boolean canConstruct2(String ransomNote, String magazine) {
        Map<Character,Integer> magazineCount = makeCountsMap(magazine);
        for (char c: ransomNote.toCharArray()){
            int count=magazineCount.getOrDefault(c,0);
            if (count>0){
                magazineCount.put(c,count-1);
            }else {
                return false;
            }
        }
        return true;
    }
}