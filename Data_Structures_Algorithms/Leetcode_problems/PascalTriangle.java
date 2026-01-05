
import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = generate(5);
        // for (List<Integer> num : triangle) {
        //     System.out.println(num);
        // }
        System.out.println(triangle);
    }

    static List<List<Integer>> generate(int num) {

        List<List<Integer>> outer = new ArrayList<>();
        if (num == 0)
            return outer;

        outer.add(new ArrayList<>());
        outer.get(0).add(1);
        for (int row = 1; row < num; row++) {
            List<Integer> prevrow = new ArrayList<>(outer.get(row - 1));
            List<Integer> cuurow = new ArrayList<>();
            cuurow.add(1);
            for (int i = 1; i < row; i++) {
                cuurow.add(prevrow.get(i - 1) + prevrow.get(i));

            }
            cuurow.add(1);
            outer.add(cuurow);

        }
        return outer;
    }
}
