package com.demotivirus.Day_006;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DoubleList<T, V> {
    private List<T> list1 = new ArrayList<>();
    private List<V> list2 = new ArrayList<>();

    public void addList1(T t){
        list1.add(t);
    }

    public void addList2(V v){
        list2.add(v);
    }

    public T getList1(T t) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.contains(t))
                return t;
        }
        return null;
    }

    public V getList2(V v) {
        for (int i = 0; i < list2.size(); i++) {
            if (list2.contains(v))
                return v;
        }
        return null;
    }

    public void add(T t, V v){
        list1.add(t);
        list2.add(v);
    }

    public T getForKey(T t){
        for (T list : list1) {
            if(list1.contains(list))
                return t;
        }
        return null;
    }
}
