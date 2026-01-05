package Oops_lec_1.Floder_1;

import java.nio.charset.StandardCharsets;

public class StaticBlock {
    static int a  = 4;
    static int b;
    static {
    System.out.println("I am in the static Block");
    b = a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+StaticBlock.b);
        StaticBlock.b+=3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
