import java.util.Scanner;

import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "level";
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        for (char c : str.toCharArray()) {
            q.add(c);
            s.push(c);
        }

        boolean flag = true;
        while (!q.isEmpty()) {
            if (!q.remove().equals(s.pop())) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is NOT palindrome");
    }
}