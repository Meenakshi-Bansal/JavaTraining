package MultipleInheritance;

//Here we are achieving multiple Inheritance
//This is called as "Is-a-Relationship".
public class HSBCBank implements USBank, UKBank{

    //Methods are overridden from the parent Interface
    //If a class is implementing any interface. then it is mendatory to override/define all the methods of Interface.
    @Override
    public void credit() {
        System.out.println("Credit");
    }

    @Override
    public void debit() {
        System.out.println("Debit");
    }

    @Override
    public void interest() {
        System.out.println("Interest");
    }

    //HSBANK Own Methods
    public void CarLoan() {
        System.out.println("CarLoan");
    }

    //Override UKBank methods

    @Override
    public void mutualFund() {
        System.out.println("mutualFund");
    }
}
