package JavaBasics;

public class IfElse {

    public static void main(String[] args) {

        int a = -90;
        int b = 60;
        int c = 30;

        /********************************************************
         * Find the greatest number
         ********************************************************/

        if (a > b && a > c) {
            System.out.println("A is greatest");
        } else if (b > c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }
}
