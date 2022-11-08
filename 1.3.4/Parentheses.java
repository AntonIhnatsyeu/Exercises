import java.util.Stack;

public class Parentheses {
    public boolean correctly(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else if (stack.peek() == '(' && a == ')' || stack.peek() == '[' && a == ']' || stack.peek() == '{' && a == '}') {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
