package ObjectCloning;
import java.util.*;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException { // inside the class if we any thrown , we
                                                                               // have declare throws its mandatory
        Human Lokesh = new Human(20, "Lokesh");
        // Human Kumar = new Human(Lokesh); // here actually its craeting an object ,
        Human twin = (Human) Lokesh.clone(); // here it just cloning the data
        System.out.println(twin.name);

        System.out.println(Arrays.toString(Lokesh.arr));
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
    System.out.println(Arrays.toString(Lokesh.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
