package Work_18;

import java.io.Serializable;

public class task1 {
    
}

class Animal implements Serializable{
    String name;
    int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Example<T extends Comparable<String>,V extends Animal & Serializable,K>{ // task 1
    private T t;
    private V v;
    private K k;
    public Example(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public T getT() {
        return t;
    }
    public V getV() {
        return v;
    }
    public K getK() {
        return k;
    }
    public void printClasses(){ // task2
        System.out.println("Class T: " + t.getClass() +"\nClass V: " + v.getClass() + "\nClass K: " + k.getClass());
    }
}

