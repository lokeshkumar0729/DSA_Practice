package Interfaces;

public class NiceCar {
   
        private Engine engine;
        private MediaPlayer player = new CDPlayer();

        public NiceCar(){
        engine = new PowerEngine();
        }

        public NiceCar(Engine engine){
        this.engine= engine;
        }
        public void Start(){
        engine.Start();
        }
        public void Stop(){
        engine.stop();
        }
        public void startMusic(){
        player.Start();
        }
        public void upGradeEngine(){
        this.engine = new ElectricEngine();
        }
}
