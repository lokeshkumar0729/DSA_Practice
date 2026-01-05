
public class LongestStringPalindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome("", "cbbd", ""));
    }

    static String Palindrome(String p, String up, String MaxString) {
        if (up.isEmpty()) {
            int start = 0;
            int end = p.length() - 1;
            while (start < end) {
                if (p.charAt(start) == p.charAt(end)) {
                    start++;
                    end--;
                } else
                    break;

            }
           
            if (start >= end && MaxString.length() < p.length() )
                return p;
            else {
                return MaxString;
            }
        }

        char ch = up.charAt(0);
        p = p + ch;
        int start = 0;
        int end = p.length() - 1;
        while (start < end) {
            if (p.charAt(start) == p.charAt(end)) {
                start++;
                end--;
            } else
                break;

        }
        if (start >= end && MaxString.length() < p.length()) {
                MaxString = p;
        }
        return Palindrome(p, up.substring(1), MaxString);
    }
}
