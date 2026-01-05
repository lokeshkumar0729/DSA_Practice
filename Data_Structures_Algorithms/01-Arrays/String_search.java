package Arrays;
import java.util.*;
public class String_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENter a String:");
        String name = in.next();
        System.out.print("Enter the character To be Searched:");
        char ch = in.next().charAt(0);
        int index = Search(name,ch);
         if(index != -1){
        System.out.println("The Element '"+ch+"' found at index "+index);
        }
        else {
        System.out.println("The Element '"+ch+"' NOt present in the array");
        }
        in.close();

    }
    static int Search(String str, char ch){
    for(int i =0; i<str.length();i++){  // it is not array to use arr.length, it is a string so that we have to use str.length()
        if(ch == str.charAt(i)){ // here charAt(i) is used to find the element at index, we have to remember that, it is not array TO USE like str[i], it just a string
        return i;
        }
    }





    // enchaced for loop
    // for(char i : str.toCharArray()){  // here we use tocharArray because , to use enhanced for loop, it must be a array so, we have to convert into array , so we use tocharArray,because str is a string
    //  if (i == ch)
    //  return i;
    // }
    return -1;
    }
}
