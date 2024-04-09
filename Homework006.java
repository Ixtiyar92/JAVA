// Задание

// Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества
// и метод позволяющий читать элементы по индексу.
// *Реализовать все методы из семинара.
// Формат данных Integer.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Homework006 {
    public static void main(String[] args) {
        MyHashSet prim = new MyHashSet();
        prim.add(1);
        System.out.println(prim.add(5));
        HashSet<Integer> nameSet = new HashSet<>();
    }
}

class MyHashSet {
    private HashMap<Integer, Object> myDB = new HashMap<>();
    private static final Object MYOBJ = new Object();
    public boolean add(int elem){
        return myDB.put(elem, MYOBJ)==null;
    }

    public boolean remove(int elem){
        return myDB.remove(elem) == MYOBJ;
    }

    public boolean isEmpty(){
        return myDB.size()==0;
    }

    public int findKey(int id){
        Object[] a = myDB.keySet().toArray();
        return (int) a[id];
    }
}