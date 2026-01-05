package String_StringBuliders;
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        StringBuilder name = new StringBuilder(in.next());

        String original = name.toString();  // Store original as String
        String reversed = new StringBuilder(original).reverse().toString(); // Reverse copy

        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
