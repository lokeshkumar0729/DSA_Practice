

public class subsequence {
    public static void main(String[] args) {
System.out.println(find("abc","aefcbgh"));
    }

    static boolean find(String s1, String s2) {
        int i = 0, j = 0;
      if(s1.isEmpty() || s2.isEmpty())
      return false;
     
            while (j < s2.length()) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);
                if (ch1 == ch2) {
                    j++;
                    i++;
                } else {
                    j++;
                }

            }  if (i == s1.length())
            return true;

        
  return false;
    }
}
