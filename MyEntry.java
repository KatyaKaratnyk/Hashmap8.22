package com.company;

public class MyEntry<K, V>{

        private K key;
        private V value;


        MyEntry( K key, V value) {
            this.key = key;
            this.value = value;

        }

        public  K getKey()        { return key; }
        public  V getValue()      { return value; }


        public void setValue(V value) {
        this.value = value;
    }
}


