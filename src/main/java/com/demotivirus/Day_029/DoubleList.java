package com.demotivirus.Day_029;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DoubleList<T, V> {
    private List<T> first;
    private List<V> second;

    public DoubleList(){
        first = new ArrayList<>();
        second = new ArrayList<>();
    }

    public void add(T t, V v){
        first.add(t);
        second.add(v);
    }
}
