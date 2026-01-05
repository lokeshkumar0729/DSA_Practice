public class LongestSubSetLength {
    public static void main(String[] args) {
        System.out.println(longestlength("", "abcabcbb", 0));
    }

    static int longestlength(String p, String up, int maxlength) {
        if (up.isEmpty()) {
            return Math.max(maxlength, p.length());
        }

        char ch = up.charAt(0);
             if(p.indexOf(ch) != -1){
                int index = p.indexOf(ch);
            p = p.substring(index +1 );
            }
            p = p + ch;
            maxlength =Math.max(maxlength,p.length());
            return longestlength(p , up.substring(1),maxlength );

        }

    }

