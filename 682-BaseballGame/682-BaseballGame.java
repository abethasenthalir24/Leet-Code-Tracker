// Last updated: 7/17/2026, 2:56:57 PM
import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;

                case "D":
                    stack.push(2 * stack.peek());
                    break;

                case "+":
                    stack.push(stack.get(stack.size() - 1) +
                               stack.get(stack.size() - 2));
                    break;

                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}