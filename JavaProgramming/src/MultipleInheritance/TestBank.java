package MultipleInheritance;

public class TestBank {

    public static void main (String[] args){

        System.out.println(USBank.min_bal);  //No need to define any object to call this variable. Also value is constant/final.

        //Static Polymorphism
        HSBCBank hsbcBank = new HSBCBank();
        hsbcBank.credit();
        hsbcBank.interest();
        hsbcBank.CarLoan();
        hsbcBank.debit();

        hsbcBank.mutualFund();

        //Dynamic Polymorphism
        //Child class objects can be referred by parent interface reference objects
        //Carloan is HSBC Bank variable. This can be called by parent interface reference objects.
        USBank USBank = new HSBCBank();
        USBank.credit();
        USBank.interest();

        UKBank ukBank = new HSBCBank();
        ukBank.mutualFund();


    }
}
