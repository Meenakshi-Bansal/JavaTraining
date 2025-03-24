package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    //Non-Static Variable
    String name = "Meenakshi";

    //Static Variable
    static int age = 30;


    public static void main(String[] args) {

        //How to call static methods and variables
        // Call directly
        sum();

        //Call with class name
        StaticAndNonStaticConcept.sum();

        System.out.println(age);  //Direct Calling
        System.out.println(StaticAndNonStaticConcept.age); //Call with class name

        //Non-Static methods and variables need an object to call.

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();

        obj.divison();  //Call with object for non-static methods.
        System.out.println(obj.name);

        // Can I access static methods with objects? Yes, we can call them but its not a good practice and they are global variable and methods.
        // they can be directly accessed.

        obj.sum();   //Its a warning call.

    }

    public static void sum() {
        System.out.println("Sum Method");
    }

    public void divison() {
        System.out.println("Divison Method");
    }
}
