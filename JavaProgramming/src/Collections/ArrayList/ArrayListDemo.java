package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main (String[] args){

        //ArrayList is a default class in Collection
        //ArrayList uses Dynamic Array.

        //This is static array
        int i[] = new int[6]; //Here array has declared with specific index value which is 6 from 0 to 5.
        i[0] = 100;
        System.out.println(i[3]); //As I dont have any value of i[3] then it will give you 0 value.
        // System.out.println(i[6]); //Exception: Index out of bound exception.
        // System.out.println(i[-1]); //Exception: Index out of bound exception. Negative is also not allowed.

        //Dynamic Array
        //Default Generics
        //ArrayList ar = new ArrayList();   //raw use of Parameterized //Any type of Data type value can be stored
        ArrayList<Object> ar = new ArrayList<Object>(); //Object can store any type of data type values.
        ar.add("Hello");  //Add to use to add the values in the index of arraylist
        ar.add("Collections");
        ar.add(100);

        System.out.println(ar); //It will print all the values  // [Hello, Collections, 100]
        System.out.println(ar.size());  //3
        System.out.println(ar.get(0)); //Hello  //Get will help you to get the values from the index.
        System.out.println("LI = "+ 0);
        System.out.println("HI = "+ (ar.size()-1));


    }
}
