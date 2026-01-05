package Binary_2D;
import java.util.*;
public class Binary_search {
    public static void main(String[] args) {
        int[][] arr =  {{1, 2, 3, 4,5},       // this code is only is use full for when we contain only equal number of rows and columuns
                       {15 ,26, 27, 38,40},
                       {19,30,42,45,55},
                       {23,34,43,46,60}};
        int target = 40;
        int result[] = search(arr,target);
        System.out.println(Arrays.toString(result));

    }

    static int[] binarySearch(int[][] arr , int target , int row,int cStart,int cEnd){
      
        while (cStart <= cEnd ) {
            int mid = cStart + (cEnd - cStart)/2;
            if(arr[row][mid] == target)
            return new int[]{row,mid};

            if(arr[row][mid] < target)
            cStart = mid +1;
            else 
            cEnd = mid -1 ;
        }
     return new int[]{-1,-1};
    } 
    static int[] search(int[][] arr , int target){
        if(arr.length ==0)
        return new int[]{-1,-1};

       int row = arr.length;
      int col = arr[0].length -1;
        if(row == 1){
        return binarySearch(arr,target,0,0,col);
        }
    int rstart = 0;
    int rend = row-1;
    int cmid = (arr[0].length-1) /2;
    while(rstart < (rend -1)) { // this will only apply to more than two roes, it will bring no.of rows into a 2 rows
        int mid = rstart + (rend - rstart)/2;
    if(arr[mid][cmid]== target)
    return new int[]{mid, cmid};
    if(arr[mid][cmid]< target)
    rstart = mid;
    else 
    rend = mid;
    }
//// we will have two rows now
 
  if (arr[rstart][cmid] == target)
  return new int[]{rstart,cmid};

   if (arr[rstart+1][cmid] == target)
  return new int[]{rstart+1,cmid};

  // searchb in first half
if (cmid - 1 >= 0 && target <= arr[rstart][cmid - 1])
    return binarySearch(arr, target, rstart, 0, cmid - 1);

if (cmid + 1 < arr[0].length && target >= arr[rstart][cmid + 1] && target <= arr[rstart][arr[0].length - 1])
    return binarySearch(arr, target, rstart, cmid + 1, arr[0].length - 1);

// similarly for rstart+1
if (cmid - 1 >= 0 && target <= arr[rstart + 1][cmid - 1])
    return binarySearch(arr, target, rstart + 1, 0, cmid - 1);

if (cmid + 1 < arr[0].length && target >= arr[rstart + 1][cmid + 1] && target <= arr[rstart + 1][arr[0].length - 1])
    return binarySearch(arr, target, rstart + 1, cmid + 1, arr[0].length - 1);


return new int[]{-1,-1};

}

}
