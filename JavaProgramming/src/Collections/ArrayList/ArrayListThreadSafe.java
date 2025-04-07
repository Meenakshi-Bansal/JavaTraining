package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListThreadSafe {
    public static void main(String[] args) {
        //Array list in not synchronized
        //CopyOnWriteArrayList - ThreadSafe variant for arraylist.

        List<String> newlist = Collections.synchronizedList(new ArrayList<String>());
        newlist.add("Java");
        newlist.add("Python");
        newlist.add("Ruby");
        //Add and  remove - we dont need any keyword explicitly synchronized
        // to fetch / trasverse then synchronized word is required.

        synchronized (newlist) {
            Iterator<String> it = newlist.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //CopyOnWriteArrayList - its a class
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Ram");
        empList.add("Sham");
        empList.add("Ravan");

        Iterator<String> it1 = empList.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
