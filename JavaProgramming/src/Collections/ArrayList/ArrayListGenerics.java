package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListGenerics {
    public static void main(String[] args){

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); //Integer is wrapper class here.
        integerArrayList.add(100); //Now arraylist is declared with specific data type which is integer. Now only integer values can be saved here.
        integerArrayList.add(200);

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        doubleArrayList.add(12.33);
        doubleArrayList.add(100.00);

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Hello World");

    }
}
