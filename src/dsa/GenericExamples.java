package dsa;

import java.io.UncheckedIOException;

public class GenericExamples<T extends Comparable<T>> implements IGenericExample<T> {

    private T [] objectTest;

    public GenericExamples(T [] objectTest){
        this.objectTest = objectTest;
    }

    public T [] getObjectTest(){
        for (T obj : objectTest){
            System.out.println(obj);
        }
        return objectTest;
    }

    public static void main(String[] args) {
        String [] arrStr = {"Testing1", "Testing2", "Testing3"};
        Integer[] intArr = {101, 202, 303};
        Boolean[] boolArr = {true, false, true};

        GenericExamples genericExamplesString = new GenericExamples(arrStr);
        GenericExamples genericExamplesInteger = new GenericExamples(intArr);
        GenericExamples genericExamplesDouble = new GenericExamples(boolArr);

        System.out.println("Return Objects from GenericExamples Class: ");
        System.out.println(genericExamplesString.getObjectTest());
        System.out.println(genericExamplesInteger.getObjectTest());
        System.out.println(genericExamplesDouble.getObjectTest());
        System.out.println('\n');

        System.out.println("Return Objects from IGenericExample Interface: ");
        System.out.println(genericExamplesString.returnObject("TestingString"));
        System.out.println(genericExamplesInteger.returnObject(2891));
        System.out.println(genericExamplesDouble.returnObject(28.91));
        System.out.println('\n');

        System.out.println("Finding Maxs:");
        System.out.println(genericExamplesString.findMax(arrStr));
        System.out.println(genericExamplesInteger.findMax(intArr));
        System.out.println(genericExamplesDouble.findMax(boolArr));
        System.out.println('\n');

        System.out.println("Finding Mins:");
        System.out.println(genericExamplesString.findMin(arrStr));
        System.out.println(genericExamplesInteger.findMin(intArr));
        System.out.println(genericExamplesDouble.findMin(boolArr));
    }

    @Override
    public T returnObject(T object) {
        return object;
    }

    @Override
    public T findMin(T [] object) {
        T value = object[0];

        for(T obj : objectTest){
            if(obj.compareTo(value)<0){
                value = obj;
            }
        }
        return value;
    }

    @Override
    public T findMax(T [] object) {
        T value = object[0];
        for(T obj : objectTest){
            if(obj.compareTo(value)>0){
                value = obj;
            }
        }
        return value;
    }
}
