import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();
        for (int i=0; i < s.length();i++){
            char curr = s.charAt(i);
            if (map.containsKey(curr)){
                char topelement = stack.isEmpty()?'a':stack.pop();
                if (topelement != map.get(curr)){
                    return false;
                }
            }else {
                stack.push(curr);

            }
        }
        return stack.isEmpty();
    }
}