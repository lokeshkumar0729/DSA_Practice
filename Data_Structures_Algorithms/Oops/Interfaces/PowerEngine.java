package Interfaces;

public class PowerEngine implements Engine {
    public void Start() {
        System.out.println("Power Engine has Started");
    }

    public void stop() {
        System.out.println("Power Engine has Stoped");
    }

    public void acc() {
        System.out.println("Power Engine has Accelerate");
    }
}
