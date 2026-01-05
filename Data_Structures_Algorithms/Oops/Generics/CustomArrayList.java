package Generics;

import java.util.*;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            reSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void reSize() {
        int[] temp = new int[DEFAULT_SIZE * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
    int removed = data[--size];
    return removed;
    }

    public int get(int index){
    return data[index];
    }
    public int size(){
    return size;
    }
    public void set(int index , int value){
    data[index] =  value;
    }

     public String toString() {
        return "CustomArrayList" + "data="+ Arrays.toString(data)+", size="+ size + '}';
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(4);
        list.add(90);
        System.out.println(list);

    }
}
