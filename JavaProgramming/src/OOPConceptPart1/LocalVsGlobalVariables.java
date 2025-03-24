package OOPConceptPart1;

public class LocalVsGlobalVariables {

    // Global variables and class variables are same.
    int age = 30;
    String name = "Meenakshi";

    public static void main (String[] args){

        int i = 10;
        LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
       System.out.println(obj.name);
       System.out.println(obj.age);
       obj.sum();

    }

    public void sum(){
        int i = 15; //Local Variables which can be used within methods only.
    }
}
