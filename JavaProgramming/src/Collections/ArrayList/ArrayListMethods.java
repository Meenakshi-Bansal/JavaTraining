package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

    public static void main (String[] args){

        ArrayList<String> st1 = new ArrayList<String>();
        st1.add("Java");
        st1.add("Python");

        ArrayList<String> st2 = new ArrayList<String>();
        st2.add("Automation");
        st2.add("Manual");

        //Method AddAll
        //st1.addAll(st2);
        System.out.println(st1); //[Java, Python, Automation, Manual]

        //st2.addAll(st1);
        System.out.println(st1); //[Java, Python]
        System.out.println(st2);//[Automation, Manual, Java, Python]

        //st1.addAll(1,st2);
        System.out.println(st1); //[Java, Automation, Manual, Python]

        //METHOD: Clear
        //st1.clear();
        System.out.println(st1); //[]

        //Method Clone
        ArrayList<String> cloneList = (ArrayList<String>)st1.clone();
        System.out.println(cloneList); //[Java, Python]

        //Method Contains
        System.out.println(st1.contains("Python")); //True
        System.out.println(st1.contains("Ruby")); //false

        //Method Indexof
        System.out.println(st1.indexOf("Python")); // Index value is 1.
        System.out.println(st1.indexOf("Python")>0); //Boolen expression

        //Method: last index of
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(Arrays.asList(100,200,300,300,100,200,600));
        System.out.println(integerArrayList.lastIndexOf(100)); //4 //Last index of particular element

        int i = integerArrayList.lastIndexOf(900);
        System.out.println(i); //Here it will not return any exception //Output will be -1

        //Method remove - Removes the values from the indexes also removes the values.
        integerArrayList.remove(1); //Removes using indexes
        integerArrayList.remove("200"); //Remove using values at indexes
        System.out.println(integerArrayList); // [100, 300, 300, 100, 200, 600]

        ArrayList<String> st10 = new ArrayList<String>(Arrays.asList("M1", "M2", "M3", "M4"));
        st10.remove("M4");
        System.out.println(st10); //[M1, M2, M3]

        //Method removeif
        ArrayList<Integer> integerArrayList1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //integerArrayList1.removeIf(num -> num%2 ==0);
        System.out.println(integerArrayList1); //[1, 3, 5, 7, 9]

        //Method retainall
        //integerArrayList1.retainAll(Collections.singleton(2));
        System.out.println(integerArrayList1); //[2] Only give you value 2

        //Method Sublist
        ArrayList<Integer> sublist = new ArrayList<Integer>(integerArrayList1.subList(3,7));
        System.out.println(sublist); //[4, 5, 6, 7]

        //Method Convert arraylist to array

        ArrayList<String> newlist = new ArrayList<String>(Arrays.asList("meenakshi", "bansal"));
        Object arr[] =  newlist.toArray();
        System.out.println(Arrays.toString(arr)); //[meenakshi, bansal]
    }
}
