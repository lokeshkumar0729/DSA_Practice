package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize 3 inner ArrayLists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println("Enter elements into the 2D ArrayList:");

        // Input elements row by row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Optional: print the 2D list
        System.out.println("You entered:");
        System.out.println(list);

        in.close();
    }
}
