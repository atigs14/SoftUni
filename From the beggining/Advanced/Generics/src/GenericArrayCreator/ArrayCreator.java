package GenericArrayCreator;


import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayCreator<T> {



    // First doesn't want to run for me
    public static<T> T[] create(int length, T item){
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[length];
        Arrays.fill(array, item);
        return array;
    }
    public static<T> T[] create(Class<T> type, int length, T item){
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(type, length);
        Arrays.fill(array, item);
        return array;
    }
}
