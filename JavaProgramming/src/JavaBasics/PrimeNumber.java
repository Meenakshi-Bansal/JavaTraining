package JavaBasics;

/***********************************************************
 * Prime Numbers:  2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 **********************************************************/

public class PrimeNumber {
    public static void main(String[] args) {
        int j = 100;
        for (j = 2; j <= 100; j++) {
            boolean isprime = true;
            for (int i = 2; i < j; i++) {
                // J modulo i which will work as remainder.
                if (j % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(j);
            }
        }
    }

    /***********************************************************
     * Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 89
     **********************************************************/

    public static void hello(String[] args) {
        int n1, n2, i, count;
        n1 = 0;
        n2 = 1;
        count = 10;

        System.out.print(n1);
        System.out.print(" " + n2);

        for (i = 1; i <= count; i++) {
            int n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
    }
}