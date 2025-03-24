package OOPSConceptPart2;

public class TestCar {
    public static void main(String[] args){

        // Static Polymorphism - Compile time polymorphism - Also known as Method Overriddiing
        //Polymorphism in Java is a core concept of object-oriented programming (OOP) that allows objects to be treated as instances of their parent class.
        // It facilitates flexibility and the ability to define methods in multiple forms.
        // Polymorphism is primarily achieved through method overriding and method overloading

        BMW b = new BMW();
        b.start();  // Overridden Method, it will take the value from BMW not from car class.
        b.Stop();
        b.TheftSafety();
        b.refill();

        System.out.println("***********************");

        Car c = new Car();
        c.stop();
        c.start();
        //c.TheftSafety(); This is child class method. Parent can not access child class methods or properties.

        // Dynamic Polymorphism // Top Casting
        Car c1 = new BMW(); //Child classes object can be referred by parent class reference variables - Dynamic Polymorphism - Run time polymorphism
        c1.start();
        c1.stop();
        // c1.TheftSafety(); - In Dynamic Polymorphism, Only common or parent class method can be accessed. By creating
        // child class object does not allow you to call child class methods.

        //Down Casting - Run time error
        //Exception in thread "main" java.lang.ClassCastException: OOPSConceptPart2.Car cannot be cast to OOPSConceptPart2.BMW
        //	at OOPSConceptPart2.TestCar.main(TestCar.java:33)
        BMW B1 = (BMW) new Car();




    }
}
