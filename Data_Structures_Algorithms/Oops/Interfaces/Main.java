package Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.Start();
        // car.acc();

        NiceCar car = new NiceCar();
        car.Start();
        car.startMusic();
        car.Stop();
        car.upGradeEngine();
        car.Start();
    }
}
