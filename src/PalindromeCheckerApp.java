import java.util.Scanner;

import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        String rev = "";
        while (!stack.isEmpty())
            rev += stack.pop();

        if (str.equals(rev))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is NOT palindrome");
    }
}