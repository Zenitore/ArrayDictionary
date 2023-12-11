import java.io.IOException;
import java.util.ArrayList;

public class ArrayDictionary<E, T> {

    int size = 0;

    ArrayList<E> keys = new ArrayList<>();
    ArrayList<T> values = new ArrayList<>();

    public ArrayDictionary(){
    }

    //add a key-value pair to the dictionary
    void put(E key, T value){
        keys.add(key);
        values.add(value);
    }

    //get the value associated with a given key
    T get(E key){
        return values.get(keys.indexOf(key));
    }

    //remove a key-value pair and return its value
    T remove(E key){
            T removedValue = values.remove(keys.indexOf(key));
            keys.remove(key);
            return removedValue;
    }

    //returns true if the given key has an associated value
    //boolean contains(E key)

    //returns true if the dictionary is empty
    //boolean isEmpty()

    //returns the number of key-value pairs in the dictionary
    //int size()

    //returns a Collection¹ of keys
    //Collection<E> keys()

    //returns a Collection of values
    //Collection<T>  values()

}
