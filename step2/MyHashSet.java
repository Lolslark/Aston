package Aston.step2;


import java.util.Arrays;

public class MyHashSet <E>{
    private static int capacity = 16;
    private Object [] array;

    MyHashSet (){
        this.array = new Object[capacity];
    }

    public boolean checkDuplicate (E key){
        for (int i = 0; array[i] != null; i++){
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }

    public void newCapacity (){
        if (array[array.length - 1] != null){
            array = Arrays.copyOf(array, capacity*2);
        }
    }

    public void add (E key){
        newCapacity();
        if (!checkDuplicate(key)){
            for (int i = 0; i < array.length; i++){
                if (array[i] == null){
                    array[i] = key;
                    break;
                }
                }
            }
        }
        public void remove (E key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                array[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        MyHashSet <Integer> set = new MyHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        System.out.println(set);

        set.remove(4);
        System.out.println(set);
    }
}

