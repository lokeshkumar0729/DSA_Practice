package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.getNum());
        System.out.println(obj.name);
        obj.setNum(49);
        System.out.println(obj.getNum());
    }
}
