import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "racecar";
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;
        boolean flag = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                flag = false;
                break;
            }
            start++;
            end--;
        }

        if (flag)
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is NOT palindrome");
    }
}