public class LongestSubString {
     public static void main(String[] args) {
        System.out.println(longestString("", "abcabcbb", ""));
    }

    static String longestString(String p, String up, String maxString) {
        if (up.isEmpty()) {
            return (p.length() > maxString.length() ? p : maxString);
        }

        char ch = up.charAt(0);
             if(p.indexOf(ch) != -1){
                int index = p.indexOf(ch);
            p = p.substring(index +1 );
            }
            p = p + ch;
           if(p.length() > maxString.length())
           maxString = p ;
            return longestString(p , up.substring(1),maxString );

        }
}
