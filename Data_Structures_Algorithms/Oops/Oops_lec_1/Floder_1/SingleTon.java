package Oops_lec_1.Floder_1;

// verify the notes
public class SingleTon {
    private SingleTon() {

    }

    private static SingleTon Instance;

    public static SingleTon getInstance() {
        if (Instance == null) {
            Instance = new SingleTon();
        }
        return Instance;

    }
}
