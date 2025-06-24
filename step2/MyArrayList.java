package Aston.step2;

import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int size() { // размер массива
        return size;
    }

    public void add(int element) {  // добавление в массив
        newSize();
        array[size++] = element;
    }

    public Object get(int index) {  //взять из массива
        return array[index];
    }

    public Object[] remove(int index) { //удалить из массива
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return array;
    }

    public void addAll(MyArrayList <E> list) {  //добавить всё
        for (int i = 0; i < list.size(); i++) {
            add(i);
        }
    }

    public void newSize() {
        if (size == array.length) {
            int newSize = array.length + 1;
            array = Arrays.copyOf(array, newSize);
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println(list);

        System.out.println(list.get(0));

        list.remove(1);

        System.out.println(list);

        MyArrayList<Integer> list1 = new MyArrayList<>();

        list1.addAll(list);

        System.out.println(list1);
    }
}
