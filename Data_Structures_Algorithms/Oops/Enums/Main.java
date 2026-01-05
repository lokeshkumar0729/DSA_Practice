package Enums;

public class Main {
    enum Week {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    

    Week(){
    System.out.println("Consturctor of " + this);
    }
}
    public static void main(String[] args) {
        Week week;
        System.out.println("hello");
        week = Week.Monday;
        System.out.println("Selected "+ week);
        // for(Week day : Week.values()){
        // System.out.println(day);
        // }
    }
}
