package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListVirtualCapacity {
    public static void main(String[] args){
        ArrayList<Object> ar = new ArrayList<Object>(); //By default Virtual Capacity of Array list will be 10.
        // Physical capacity will be 0.

        System.out.println(ar.size());

        ar.add(100);

        //System.out.println(ar.get(0));
        System.out.println(ar.size());
        ar.add(200);
        ar.add(100);
        ar.add(200);

        System.out.println(ar.size());

        //If user want to specify the virtual capacity as 20 not 10. Then
        ArrayList<Object> ar1 = new ArrayList<Object>(20);
        System.out.println(ar1.size());  //Size will take the value of your Physical capacity.
        //As we have not added any value to arraylist ar1 that value size value is 0. Maximum 20 values can be stores in this array list.

    }
}
