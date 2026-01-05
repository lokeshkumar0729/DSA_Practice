package Oops_lec_1.Floder_1;

public class Human {
    int age ;
    String name;
    int salary ; 
    boolean married ;
    static int population ;

    Human(int age , String name , int salary, boolean married){
    this.age = age;
    this.name = name;
    this.salary= salary;
    this.married = married;
    // this.population+= 1;
    // in case of 'this' , we have to use class name , when we declare static keyword
    Human.population+=1;
    }
    
}
