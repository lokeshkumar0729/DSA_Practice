package Interfaces.defaultMethods;

public class Main implements A, B {
    @Override
    public void greet(){
    System.out.println("I am greeted");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.greet();
        A.game();
    }
}
