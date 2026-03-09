import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Service class
class PalindromeService {
    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.checkPalindrome(str);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "mada";

        // Choose strategy dynamically
        PalindromeService service = new PalindromeService(new StackStrategy());
        // PalindromeService service = new PalindromeService(new DequeStrategy());

        if (service.check(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
