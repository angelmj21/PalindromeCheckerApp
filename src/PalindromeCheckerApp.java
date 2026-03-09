import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    // Two pointer method
    static boolean twoPointer(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack method
    static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    // Deque method
    static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "madamimadam";

        long start, end;

        // Two Pointer
        start = System.nanoTime();
        twoPointer(input);
        end = System.nanoTime();
        System.out.println("Two Pointer Time: " + (end - start) + " ns");

        // Stack
        start = System.nanoTime();
        stackMethod(input);
        end = System.nanoTime();
        System.out.println("Stack Method Time: " + (end - start) + " ns");

        // Deque
        start = System.nanoTime();
        dequeMethod(input);
        end = System.nanoTime();
        System.out.println("Deque Method Time: " + (end - start) + " ns");
    }
}