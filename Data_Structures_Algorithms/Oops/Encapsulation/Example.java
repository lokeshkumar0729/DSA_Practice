package Encapsulation;

public class Example {
    private int num ;
    String name;
    int[] arr ;

    Example(){
    this.num = -1;
    this.name = "Lokesh";
    this.arr = new int[0];
    }
    public int getNum(){
    return num;
    }
    public void setNum(int num){
        this.num = num;
    }
}
