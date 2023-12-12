import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<E, T> {


    ArrayList<E> keys = new ArrayList<>();
    ArrayList<T> values = new ArrayList<>();

    int size = 0;

    public ArrayDictionary(){
    }

    //add a key-value pair to the dictionary
    void put(E key, T value){
        keys.add(key);
        values.add(value);
        size++;
    }

    //get the value associated with a given key
    T get(E key){
        if (keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }
        System.out.println("Something went wrong. There was not a key, " + key + " , contained within the Dictionary");
        return null;
    }

    //remove a key-value pair and return its value
    T remove(E key){
            T removedValue = values.remove(keys.indexOf(key));
            keys.remove(key);
            size--;
            return removedValue;
    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        return keys.contains(key);
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return size==0;
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return size;
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        return keys;
    }

    //returns a Collection of values
    Collection<T>  values(){
        return values;
    }

}
