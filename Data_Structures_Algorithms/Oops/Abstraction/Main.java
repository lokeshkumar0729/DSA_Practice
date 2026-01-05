package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(10);
        son.career();

        son.Partner();
        Parent.fun();
        son.Base();

        Daughter daughter = new Daughter(41);
        daughter.Partner();

    }
}
