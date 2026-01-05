

public class Roman_Integer {
    public static void main(String[] args) {
        System.out.println(roman("I"));       // 1
        System.out.println(roman("IV"));      // 4
        System.out.println(roman("IX"));      // 9
        System.out.println(roman("LVIII"));   // 58
        System.out.println(roman("MCMXCIV")); // 1994
    }

    static int roman(String s) {
        int result = 0;
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            // ✅ Look ahead safely
            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);

                if (ch == 'I' && next == 'V') {
                    result += 4;
                    i += 2; // skip next
                    continue;
                }
                if (ch == 'I' && next == 'X') {
                    result += 9;
                    i += 2;
                    continue;
                }
                if (ch == 'X' && next == 'L') {
                    result += 40;
                    i += 2;
                    continue;
                }
                if (ch == 'X' && next == 'C') {
                    result += 90;
                    i += 2;
                    continue;
                }
                if (ch == 'C' && next == 'D') {
                    result += 400;
                    i += 2;
                    continue;
                }
                if (ch == 'C' && next == 'M') {
                    result += 900;
                    i += 2;
                    continue;
                }
            }

            // ✅ Normal Roman values
            if (ch == 'I') result += 1;
            else if (ch == 'V') result += 5;
            else if (ch == 'X') result += 10;
            else if (ch == 'L') result += 50;
            else if (ch == 'C') result += 100;
            else if (ch == 'D') result += 500;
            else if (ch == 'M') result += 1000;

            i++;
        }

        return result;
    }
}
