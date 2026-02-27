import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "level";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);

        if (str.equals(rev))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is NOT palindrome");
    }
}