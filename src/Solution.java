import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        boolean isValidString = true;

        if(charArray.length <= 1) {
            return false;
        }

        Stack stack = new Stack();

        for(char c: charArray) {
            if(stack.isEmpty()) {
                stack.push(c);
            } else {
                // pop element if it matches else push
                if(((char)stack.peek() == '(' && c == ')')
                        || ((char)stack.peek() == '{' && c == '}')
                        || ((char)stack.peek() == '[' && c == ']')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        if(!stack.isEmpty()) {
            isValidString = false;
        }

        return isValidString;
    }


    public static void main(String[] args) {
        Solution.isValid("()");
    }
}

