package String_Recursion;

public class Stream {
    public static void main(String[] args) {
        Skip("", "baccdaha");
       System.out.println(Skip_2("baccdaha"));
        System.out.println(Skip_3("baccahaApple"));
    }

    static void Skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a')
            Skip(p, up.substring(1));
        else
            Skip(p + ch, up.substring(1));

    }

    static String Skip_2(String up) {
        if (up.isEmpty())
            return "";
        char ch = up.charAt(0);
        if (ch == 'a')
            return Skip_2(up.substring(1));
        else
            return ch + Skip_2(up.substring(1));
    }

    static String Skip_3(String up) {
        if (up.isEmpty())
            return "";

        if (up.startsWith("Apple")) {
            return Skip_3(up.substring(5));
        } else {
            char ch = up.charAt(0);
            return ch + Skip_3(up.substring(1));
        }

    }
}
