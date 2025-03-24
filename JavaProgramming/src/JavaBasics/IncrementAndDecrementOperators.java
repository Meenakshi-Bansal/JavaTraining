package JavaBasics;

public class IncrementAndDecrementOperators {

    public static void main (String [] args){

        //++ - Increment
        //-- = Decrement

        int i = 1;
        int j = i++;   // Post Increment

        System.out.println(i); //2
        System.out.println(j); //1

        int a,b;
        a = 1;
        b = ++a; // Pre Increment

        System.out.println(a); //2
        System.out.println(b); //2

        int k, l;
        k = 2;
        l = k--; // Post Decrement   // l = 2 and K = 1
        l = --k; //Pre Decrement     // l = 0 and k = 0

        System.out.println(k); //0
        System.out.println(l);//0
    }
}
