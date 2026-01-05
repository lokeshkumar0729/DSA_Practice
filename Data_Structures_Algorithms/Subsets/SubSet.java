package Subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
        System.out.println(list);
        }
        // String arr = "abcdjfjgytdyrytrf6tydserydtytriu6td6yey56futrchdctywrecdfjgfvkujyhcvydfckjvu,jokuyguthdxcrtyvgiuytdttylikyujtyrecxvbhjuhyjtrtexcvbjoiuytredfghvchdtvesdyhouiytu";
        // for (int i = 0; i < arr.length(); i++) {
        //     for (int j = i; j < arr.length(); j++) {
        //         System.out.print("[");
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(arr.charAt(k));
        //         }
        //         System.out.print("]");
        //         System.out.println();
        //     }
        // }
    }

 static List<List<Integer>> subset(int[] arr){
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num : arr){
    int n = outer.size();
    for(int i =0;i<n;i++){
    List<Integer> internal = new ArrayList<>(outer.get(i));
    internal.add(num);
    outer.add(internal);
    }
    }
    return outer;

}
}
// Step-by-Step Explanation
// Step 1: Initialize the outer list
// List<List<Integer>> outer = new ArrayList<>();
// outer.add(new ArrayList<>());


// outer will store all subsets.

// Start with one subset: the empty subset [].

// So initially:

// outer = [[]]

// Step 2: Iterate through each element of the array
// for(int num : arr){


// We take each number in the array and try to add it to existing subsets to make new subsets.

// For arr = [1,2,3], we will loop:

// num = 1 → num = 2 → num = 3

// Step 3: Store current size of outer
// int n = outer.size();


// n tells us how many subsets exist before adding num.

// This is important because we only want to add num to existing subsets and not the new ones we are currently creating (avoids infinite loop).

// Initially, for num = 1:

// outer = [[]] → n = 1

// Step 4: Iterate over existing subsets
// for(int i =0;i<n;i++){


// We go through all current subsets in outer.

// Each subset at index i will generate a new subset with num added.

// Step 5: Copy the current subset
// List<Integer> internal = new ArrayList<>(outer.get(i));


// outer.get(i) → current subset (like [])

// new ArrayList<>(...) → make a copy, because we don’t want to modify the original subset.

// Example for num = 1:

// i = 0 → outer.get(0) = [] → internal = []

// Step 6: Add the current number to the copy
// internal.add(num);


// We add num to the copied subset to form a new subset.

// Example:

// internal = [] → add 1 → internal = [1]

// Step 7: Add the new subset to outer
// outer.add(internal);


// Add the new subset to outer.

// Now outer contains all old subsets + new ones.

// Example after num = 1:

// outer = [] (old) + [1] (new) → outer = [[], [1]]

// Step 8: Repeat for next numbers

// num = 2

// Current outer = [[], [1]]
// n = 2
// i = 0 → internal = [] → add 2 → [2] → outer = [[], [1], [2]]
// i = 1 → internal = [1] → add 2 → [1,2] → outer = [[], [1], [2], [1,2]]


// num = 3

// Current outer = [[], [1], [2], [1,2]]
// n = 4
// i = 0 → internal = [] → add 3 → [3]
// i = 1 → internal = [1] → add 3 → [1,3]
// i = 2 → internal = [2] → add 3 → [2,3]
// i = 3 → internal = [1,2] → add 3 → [1,2,3]
// Final outer = [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]


// ✅ All subsets are generated!

// Step 9: Return outer
// return outer;


// Now outer contains all subsets of the input array.