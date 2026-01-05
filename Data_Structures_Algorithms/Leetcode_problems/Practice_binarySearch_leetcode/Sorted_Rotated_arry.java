package Practice_binarySearch_leetcode;
import java.util.*;
public class Sorted_Rotated_arry {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,8};
        int pivot = 3;
        int temp ;
        for(int i =0; i <= pivot; i++){
             temp = arr[arr.length-1];
        for (int j =arr.length-2;j>-1;j--){
           
     arr[j+1]=arr[j];
        }
        arr[0]= temp;
        }
        int target = 7;
       System.out.println(binarysearch(arr,target));
       System.out.println(Arrays.toString(arr));
    }

        static int binarysearch(int[] arr, int target)
        {
                 if(arr.length == 0)
                     return -1;
                int start = 0;
                int end = arr.length-1;
                while(start<= end)
                {
                    int mid = start + (end-start)/2;
                    if(target == arr[mid])
                    return mid;
                    else 
                    {
                        if (arr[mid]>target)
            {
                             start = mid +1;
                             if (arr[start] < arr[end])
                {
                                  while(start <= end)
                    {
                                       mid = start+(end-start)/2;
                        if(arr[mid] == target)
                        {
                        return mid;
                        }
                        else if (target > arr[mid])
                        {
                            start = mid+1;
                        }
                        else
                        {
                        end = mid-1;
                        }
                    }
                        
                        return -1;
                }
                        
                        
                        
            }
                            
                         else 
                         {
                         end = mid-1;
                         if(arr[start]> arr[end]){
                        
                                  while(start <= end)
                    {
                                       mid = start+(end-start)/2;
                        if(arr[mid] == target)
                        {
                        return mid;
                        }
                        else if (target > arr[mid])
                        {
                            start = mid+1;
                        }
                        else
                        {
                        end = mid-1;
                        }
                    }
                        
                        return -1;
                        }
                         }   
        
                    }
        
                }
                 return -1;
        }
    }
