import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";

        if (str.equals(new StringBuilder(str).reverse().toString()))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is NOT palindrome");
    }
}