package Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(32, "kunal");
        // System.out.println(obj.name);
        System.out.println(obj.getNum());
        obj.SetNum(49);
          System.out.println(obj.getNum());
    }
}
