package JavaBasics;

public class LoopsConcept {

    public static void main(String[] args){

        /***************************************************
         * While Loop
         ***************************************************/

        int i = 1; // initialization
        while (i<=10){       //Conditional
            System.out.println(i);
            i++;   //i=i+1;  //Incremental/Decrement
        }

        /***************************************************
         * For Loop
         ***************************************************/

        //Single Line code for initialization, condition and Increment/Decrement. That's why its different from while loop

        for(int j = 1; j<=10; j++){
            System.out.println(j);
        }


    }
}
