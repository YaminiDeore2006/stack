import java.util.Stack;

class Solution {
    public int evaluatePostfix(String[] arr) {

        Stack<Integer> stk = new Stack<>();

        for (String ch : arr) {

            // If operand
            if (!ch.equals("+") &&
                !ch.equals("-") &&
                !ch.equals("*") &&
                !ch.equals("/") &&
                !ch.equals("%") &&
                !ch.equals("^")) {

                stk.push(Integer.parseInt(ch));
            }
            // If operator
            else {

                int a = stk.pop();   // First pop
                int b = stk.pop();   // Second pop

                switch (ch) {

                    case "+":
                        stk.push(b + a);
                        break;

                    case "-":
                        stk.push(b - a);
                        break;

                    case "*":
                        stk.push(b * a);
                        break;

                    case "/":
                        stk.push(Math.floorDiv(b, a));   // Handles negative division correctly
                        break;

                    case "%":
                        stk.push(b % a);
                        break;

                    case "^":
                        stk.push((int) Math.pow(b, a));
                        break;

                    default:
                        return -1;
                }
            }
        }

        return stk.peek();
    }
}
