package MazeAndBackTracking;

public class CountPossibleWays {
    public static void main(String[] args) {
        System.out.println(path( 3, 3));
    }
     static int path( int r, int c) {
        int left =0, right=0 ;
        if (r == 1 && c == 1) {
            return 1;
        }
        if (r > 1)
          left = path( r - 1, c);
        if (c > 1)
           right =  path(r, c - 1);
        return left + right ;
    }
      static int Routes(int r, int c) {
        if (r == 1 || c == 1)
            return 1;
        int left = Routes(r - 1, c);
        int right = Routes(r, c - 1);
        return left + right;
    }
}
