package dsa;

public interface IGenericExample <T extends  Comparable<T>> {
    T returnObject(T object);
    T findMin(T [] object);
    T findMax(T [] object);
}
