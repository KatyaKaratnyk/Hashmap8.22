package com.company;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 8/22/2017.
 */
public class MyMap<K extends Comparable<K>, V>{

    HashMap<K, V> myHashMap;
     MyMap() {
        myHashMap = new HashMap<K, V>();    }

    public V get(K key) {
         return myHashMap.get(key);
    }

    public void put(K key, V value) {
         myHashMap.put(key, value);
    }

    public  int size() {
        return myHashMap.size();
    }
    remove() { }

    public void keySet(MyEntry<K, V> myEntry) {
         myEntry.
    }


}

