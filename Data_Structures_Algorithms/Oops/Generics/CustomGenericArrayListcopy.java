package Generics;


import java.util.*;

public class CustomGenericArrayListcopy<T> {

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenericArrayListcopy() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            reSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void reSize() {
        Object[] temp = new Object[DEFAULT_SIZE * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
    T removed = (T)(data[--size]);
    return removed;
    }

    public T get(int index){
    return (T)data[index];
    }
    public int size(){
    return size;
    }
    public void set(int index , T value){
    data[index] =  value;
    }

     public String toString() {
        return "CustomArrayList" + "data="+ Arrays.toString(data)+", size="+ size + '}';
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        CustomGenericArrayListcopy<Integer> list = new CustomGenericArrayListcopy<>();
        list.add(2);
        list.add(4);
        list.add(90);
        System.out.println(list);

    }
}
