
public class Closest {
    public static void main(String[] args) {
        System.out.println(findclosest(2, 5, 6));
    }
    static int findclosest(int x , int y , int z){
    if(Math.abs(x-z) == Math.abs(y- z))
    return 0;
    if(Math.abs(x-z)<Math.abs(y-z))
    return 1;
    else
    return 2;  
    }
}
