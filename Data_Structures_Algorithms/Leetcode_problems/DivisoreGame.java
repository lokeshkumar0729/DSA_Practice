

public class DivisoreGame {
    public static void main(String[] args) {
        System.out.println(find(3));
    }
    static boolean find(int n){
        int a = n ;
        int b = a -1 ;
            a = b;
    while(a != 1 && b != 1){
    a = b -1;
    b  = a-1;

    }
    if(a==1)
    return true;
    return false;
    }
}
