package Interfaces;

public class Car implements Engine , Brake {
    @Override
   public void Start(){
    System.out.println("I love to Start the car");
    }
     @Override
   public  void stop(){
    System.out.println("I am not Excited to Stop");
    }
    @Override
  public  void acc(){
    System.out.println("I am ready to Accelerate the car");
    }
    @Override
   public void brake(){
    System.out.println("i am not intest in apply the brake");
    }
}
