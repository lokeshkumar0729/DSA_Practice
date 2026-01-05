package LambdaFunctions;

public class Main {

    // Anonymous class version
    Operation sum = new Operation() {
        public int operation(int a, int b) {
            return a + b;
        }
    };

    // Lambda versions
    
    Operation prod = (a, b) -> a * b;
    Operation divi = (a, b) -> a / b;

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Sum: " + obj.operate(2, 3, obj.sum));
        System.out.println("Product: " + obj.operate(2, 3, obj.prod));
        System.out.println("Division: " + obj.operate(6, 3, obj.divi));
    }
}

