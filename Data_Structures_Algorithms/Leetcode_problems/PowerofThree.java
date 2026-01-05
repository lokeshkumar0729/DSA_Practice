public class PowerofThree {
    public static void main(String[] args) {
        long num = 476532874;
       System.out.println(check(num));
    }

    static boolean check(long target) {
        if (target < 0)
            return false;
        if (target > 0) {
              long i = 0;
            while (true) {
                if ((long)(Math.pow(3, i)) == target)
                    return true;
                if ((long)(Math.pow(3, i)) > target)
                    return false;
                i++;
            }
        }
        return false;
    }
}
