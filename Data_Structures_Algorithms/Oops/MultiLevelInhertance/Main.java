package MultiLevelInhertance;

public class Main {
    public static void main(String[] args) {
        BoxPrice obj1 = new BoxPrice(249);
        System.out.println(obj1.Price);
        BoxPrice obj2 = new BoxPrice(4,70,278);
        System.out.println(obj2.l+" "+obj2.Weight+" "+obj2.Price);
    }
    
}
