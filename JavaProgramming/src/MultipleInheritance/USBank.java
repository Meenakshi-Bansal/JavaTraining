package MultipleInheritance;

public interface USBank {
    int min_bal = 100;
    public void credit();
    public void debit();
    public void interest();

    //Here only we can declare methods. Methods properties will be defined where we will implements the interface.
    //No method body - only method prototype/method name.
    // In interface, we can declare variables but variables will be static and final in nature. Static means no object needed to call the variable. Final means value can not be changed.
    //No Static method in interface.
    // No Main method in interface.
    // we can not create objects of interface.
    // Interface is abstract in nature.
}
