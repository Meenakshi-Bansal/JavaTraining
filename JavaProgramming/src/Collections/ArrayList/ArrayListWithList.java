package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithList {
    public static void main(String[] args){

        //How to create an arraylist with another array list.
        ArrayList<Integer> value = new ArrayList<Integer>(Arrays.asList(100,200,300,400));

        for(Integer p1 : value){
            System.out.println(p1); //100 200 300 400
        }
        System.out.println(value.size());  //4
        System.out.println(value); //[100, 200, 300, 400]

        value.add(500);
        System.out.println(value.size()); //5
        System.out.println(value); //[100, 200, 300, 400, 500]
    }
}
