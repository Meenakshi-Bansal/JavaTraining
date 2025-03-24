package OOPConceptPart1;

import java.awt.*;

public class MethodOverloading {

    //Method Overloading: When method name is same but different arguments or input parameters within the same class.
    //But if same method has same number of input parameters but different return types.

    //We can overload main method
    // You can not create a method inside the method


    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(1.33);
        obj.sum(1, 2);
        obj.main(10);
    }

    public static void main(int z){
        System.out.println("Main Method Overloading");
    }

    public void sum() {  //Without input param
        System.out.println("Sum Method with Zero parameters");
    }

    public void sum(int a) {  //Without input param
        System.out.println("Sum Method with one parameters");
    }

    public void sum(double b) {  //Without input param
        System.out.println("Sum Method with one parameters");
    }

    public void sum(int x, int y) {  //Without input param
        System.out.println("Sum Method with two parameters");
    }
}
