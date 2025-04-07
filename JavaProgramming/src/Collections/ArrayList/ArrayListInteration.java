package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListInteration {
    public static void main(String[] args){

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); //Integer is wrapper class here.
        integerArrayList.add(100); //Now arraylist is declared with specific data type which is integer. Now only integer values can be saved here.
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(400);
        integerArrayList.add(500);
        integerArrayList.add(600);

        //FOR LOOP
        for (int i = 0; i<integerArrayList.size(); i++){
            System.out.println(integerArrayList.get(i));
        }

        System.out.println("**------------------------------------**");
        //For each loop
        for(Integer it : integerArrayList){
            System.out.println(it);
        }

        System.out.println("**------------------------------------**");

        //Streams Lambda Function - After JDK 8
        integerArrayList.stream().forEach(it1 ->System.out.println(it1));

        System.out.println("**------------------------------------**");

        //iterator - Iterate the data from collection
        Iterator<Integer> it2 = integerArrayList.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        int k[] = new int[3];
        k[0] = 100;
        k[1] = 200;
        k[2] = 300;

        System.out.println("**------------------------------------**");
        //for each loop
        for(int m : k) {
            System.out.println(m);
        }

        System.out.println("**------------------------------------**");

    }
}
