package OOPSConceptPart2;

public class BMW extends Car{ // has-a-relationship

    //Method Overriding
    //When we have same method in parent and child class, but preference will be given to child class. It is called as method overriding.
    public void start(){
        System.out.println("BMW------------Start");
    }
    public void Stop(){
        System.out.println("BMW------------Stop");
    }
    public void TheftSafety(){
        System.out.println("BMW------------TheftSafety");
    }
}
