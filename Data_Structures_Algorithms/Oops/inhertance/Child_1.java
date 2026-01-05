package inhertance;

public class Child_1 extends Parent_1 {
    int weight ;
    Child_1(){
    this.weight = -1;
    }
Child_1(int l, int h , int w, int weight){
super(l,h,w);
this.weight = weight;
}
public static void main(String[] args) {
    Child_1 obj = new Child_1();
    System.out.println(obj.h +" "+obj.weight);
    Child_1 obj2 = new Child_1(1,2,3,4);
    System.out.println(obj2.h+" "+obj2.weight);
}
}
