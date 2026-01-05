package String_Recursion;


import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //   permutations("", "abc");
          System.out.println(permutationsList("", "abc"));
        // System.out.println(permutationscount("", "234"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        int n = p.length() + 1;
        for (int i = 0; i < n; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));

        }
    }
    
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        int n = p.length() + 1;
        for (int i = 0; i < n; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));

        }
        return ans;
    }
    
    static int permutationscount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        int n = p.length() + 1;
        for (int i = 0; i < n; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
           count = count + permutationscount(f + ch + s, up.substring(1));

        }
        return count;
    }

}
