package Arrays_Recursion;


import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 9, 18, 18 };
        int target = 18;

        // int ans = linearSearch(arr, target, 0);
        // if(ans >=0)
        // System.out.println("The Element found at the index : "+ans);
        // else
        // System.out.println("The Element does not found");
        ArrayList<Integer> list = ReturnWithoutPassinglist(arr, target, 0);
        System.out.println(list);

    }

    static int linearSearch(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target)
            return index;
        return linearSearch(arr, target, index + 1);

    }

    // find the all occurance of target
    static ArrayList<Integer> findAllTargets(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index >= arr.length) {
            return list;
        }
        if (arr[index] == target)
            list.add(index);
        return findAllTargets(arr, target, index + 1, list);

    }

    // without passing an argument , we are returing a list
    static ArrayList<Integer> ReturnWithoutPassinglist(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index >= arr.length) {
            return list;
        }
        if (arr[index] == target)
            list.add(index);

        ArrayList<Integer> list1 = ReturnWithoutPassinglist(arr, target, index + 1);
        list.addAll(list1); // list addAll is used to merge all the lists
        return list;

    }
    // if we want to list.add() insetaed of list.addAll() .. then we want to create
    // a object of array like...
    // ArrayList<Object> list = new ArrayList<>()
    // here we can add list , the output will be [3,[4]]

    // why we using list.addAll()
    // because , ArrayList<Integer>() so the return type should be integer not list
}
