public class ReverseWord557 {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()+ " ");
        }
        return  result.toString().strip();
    }
}