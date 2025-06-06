import java.util.Stack;

public class Solution {
    
    // Method to check valid parentheses
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Optional: main method for testing locally
    public static void main(String[] args) {
        Solution sol = new Solution();
        String test = "([])";
        System.out.println(sol.isValid(test));  // Expected output: true
    }
}
