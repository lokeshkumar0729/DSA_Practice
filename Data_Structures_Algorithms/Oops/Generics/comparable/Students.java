package Generics.comparable;

public class Students implements Comparable<Students>{
    int rollno ;
    float marks ;

    Students(int rollno , float marks){
    this.rollno = rollno;
    this.marks = marks;
    }

   public int compareTo(Students o){
    System.out.println("Hello");
    int diff = (int)(this.marks - o.marks);

    return diff;

}
public String toString(){
return marks + "";
}

}
