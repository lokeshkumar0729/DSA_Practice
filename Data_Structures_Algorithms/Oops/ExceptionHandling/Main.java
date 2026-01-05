package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a  = 5 ; 
        int b = 0 ;
        try {
        // int c  = a / b ;
        div(a, b);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }finally{
        System.out.println("this will run in any chances");
        }

    }
    static int div(int a , int b) throws ArithmeticException{
    if(b == 0){
    throw new ArithmeticException("Please verify the value");
    }
    return a/b;
    }
}
