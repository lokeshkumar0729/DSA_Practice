package Oops_lec_1.Floder_1;
// every thing is written in the notes please verify it
public class InnerClasses {
    static class Test {
        /* static */ String name; // when you declare 'static' to the varaibles , it works as an static

        Test(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Test obj1 = new Test("Lokesh");
            Test obj2 = new Test("Kumar");

            System.out.println(obj1.name);
            System.out.println(obj2.name);

        }
    }
}
