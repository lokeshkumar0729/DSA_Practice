package Generics.comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Students kunal = new Students(49, 89.09f);
        Students Rahul = new Students(23, 78.30f);
        Students vijay = new Students(24, 88.12f);
        Students Shiva = new Students(33, 94.25f);
        Students Bunny = new Students(13, 93.22f);

        Students[] list = { kunal, Rahul, vijay, Shiva, Bunny };
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);// here the sort directly depends on the object compareto in the local code , so
                          // it directly calls method, when we doesnt declare the comaprebale method , it
                          // fails, due to the class Student doesnt have method like comaprable
        Arrays.sort(list, new Comparator<Students>() {
            @Override
            public int compare(Students a, Students b) {
                // sort by marks
                return Float.compare(a.marks, b.marks);
            }
        });
        Arrays.sort(list, (a, b) -> Float.compare(a.marks, b.marks));

        System.out.println(Arrays.toString(list));

        if (kunal.compareTo(Rahul) < 0) {
            System.out.println("Rahul gains more marks");
        }
    }
}
