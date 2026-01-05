package Interfaces;

public class ElectricEngine implements Engine{
      public void Start() {
        System.out.println("Electric Engine has Started");
    }

    public void stop() {
        System.out.println("Electric Engine has Stoped");
    }

    public void acc() {
        System.out.println("Electric Engine has Accelerate");
    }
}
