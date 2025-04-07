package Programs;



public class Program1 {
    public static void main (String[] args){

        Program1 obj = new Program1();
//        obj.numberNature();
//        obj.validTriangle();
//        obj.factorial();
//        obj.primeNbr();
//        obj.triangleType();
//        obj.sumOfIntegers();
//        obj.gcd();
        obj.primeNumber();

    }

    // You are given three numbers. You need to calculate and print their average value. Draw a flowchart for this process.

    public void avg(){
        int a = 2;
        int b = 0;
        int c = 0;
        int avg;
        avg = (a+b+c)/3;
        System.out.println("Value of d is = "+avg);
    }

    //You are given a single number. You need to print one of the following outputs according to the number's nature.
    //
    //Print 1, if the number is positive
    //
    //Print -1, if it's negative
    //
    //Print 0, if it's equal to 0

    public void numberNature(){
        int num = 0;
        if (num>0){
            System.out.println("Number is positive");
        }
        else if (num<0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }

    //You are given 3 numbers. Each number represents the length of a line. You need to figure out whether these lines can form a valid triangle.
    //
    //If a valid triangle can be formed, print "Yes", otherwise print "No".
    //
    //A triangle is a valid triangle, If and only If, the sum of any two sides of a triangle is greater than the third side.
    // For Example, let A, B and C are three sides of a triangle. Then, A + B > C, B + C > A and C + A > B

    public void validTriangle(){
        int a = 10;
        int b = -20;
        int c = -30;
        if (a+b>c || b+c>a || a+c>b){
            System.out.println("Side values are correct to make valid triangle");
        }
        else {
            System.out.println("Side values are not correct to make valid triangle");
        }
    }

    //You are given a single non-negative integer, N. You need to calculate and print N factorial (N!)
    //
    //N factorial is defined as the product of all integers from 1 to N (both inclusive)

    public void factorial(){
        int a = 10, factorial=1;
        for (int i=a; i>0; i--){   //a = 9 i = 10
            int b = factorial*i; //8*90 = 10
            factorial = b; // 90
        }
        System.out.println(factorial);
    }

    //You are given a single positive integer, N. You need to print all even integers that occur between 1 and N (both inclusive).

    public void primeNbr(){
        int a = 100;
        System.out.println("Print all the integers");
        for (int i = 1; i<=a; i++){
            int prime = i%2;
            if (prime==0){
                System.out.println(i);
            }
        }
    }

    //You are given the lengths of 3 sides of a valid triangle. You need to print any one of the following outputs depending on the triangle's nature.
    //
    //Print 1, if the triangle is equilateral
    //Print 0, if it's isosceles
    //Print -1, if it's scalene

    public void triangleType(){
        int a = 10;
        int b = 30;
        int c = 20;
        if (a==b && b==c){
            System.out.println("Its equilateral");
        }
        else if (a==b || b==c || c==a){
            System.out.println("Its isosceles");
        }
        else{
            System.out.println("Its scalene");
        }
    }

    //You are given a single positive integer, N. You need to calculate and print the sum of all even numbers till N(inclusive)
    public void sumOfIntegers(){
        int a = 100;
        int b = 0;
        int sum=0;
        for (int i = 1; i<=100; i++){
            int even = i%2;
            if (even==0){
               b = b+i;
               sum=b;
            }
        }
        System.out.println(sum);
    }

    //You are given two numbers. You need to calculate and print their greatest common divisor (GCD).

    public void gcd(){
        int a = 16;
        int b = 12;
        int low;
        int GCD=1;
        if (a>b){
             low = b;
        }
        else {
            low = a;
        }
        for (int i = 1; i<=low; i++){
            if (a%i==0 && b%i==0){
                GCD = i;
            }
        }
        System.out.println(GCD);
    }

    //You are given a single positive integer, N. You need to find and print whether N is Prime or not.
    public void primeNumber(){
        int a = 13;
        boolean prime = true;
        for(int i = 2; i<a; i++){
            if (a%i==0){
                System.out.println("Number is not prime");
                prime=false;
                break;
            }
        }
        if (prime){
            System.out.println("Number is prime");
        }
    }


    //You are given a single non-negative integer, N. You need to print all numbers that:
    //
    //(i) occur in the range 0 to N (both inclusive)
    //
    //(ii) are a part of the fibonacci sequence
    //
    //Draw a flowchart for this process
    //
    //Note 1: The first two terms of the fibonacci sequence are 0 and 1.
    //
    //Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.

    //You are given a single non-negative integer, N. You need to find out whether N is a part of the fibonacci sequence.
    //
    //Print "Yes" if it is and "No" if it's not.
    //
    //Draw a flowchart for this process
    //
    //Note 1: The first two terms of the fibonacci sequence are 0 and 1.
    //
    //
    //
    //Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
}


