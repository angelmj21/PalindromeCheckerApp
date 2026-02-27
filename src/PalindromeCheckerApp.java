import java.util.Scanner;

import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "noon";
        Deque<Character> dq = new LinkedList<>();

        for (char c : str.toCharArray())
            dq.add(c);

        boolean flag = true;
        while (dq.size() > 1) {
            if (!dq.removeFirst().equals(dq.removeLast())) {
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