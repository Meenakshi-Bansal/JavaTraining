package JavaBasics;

public class ArrayConcept {

    public static void main(String[] args){

        // Array when we want to declare set of values to a variable then array can be used.
        // Array index will start with 0
        // Index will be end with n-1
        // N is length of array.
        // this is one dimensional array.

        // Dis Advantages of the array
        // Size is fixed - static array - This problem can be resolved with collections: Hashtable, ArrayList, Use Dynamic array.
        // Similar data type - This problem can be resolved by using Object Array.

        // Array Declaration

        int i[] = new int[5];
        int[] j = new int[5];

        i[0]=0;
        i[1]=1;
        i[2]=2;
        i[3]=3;
        i[4]=4;

        // Print all the values of the array

        for (int k = 0; k<i.length; k++){
            System.out.println(i[k]);
        }

        // Object Array

        Object info[] = new Object[3];

        info[0] = "Meenakshi";
        info[1] = 30;
        info [2] = 2.5;

        System.out.println(info[2]);


        /*******************************************************
         * Two Dimensional Array
         ******************************************************/

        String x[][] = new String[3][5];

        System.out.println(x.length);   // Number of rows
        System.out.println(x[0].length);   // Number of columns

        x[0][0]="A";
        x[0][1]="B";
        x[0][2]="C";
        x[0][3]="D";
        x[0][4]="E";

        x[1][0]="A1";
        x[1][1]="B1";
        x[1][2]="C1";
        x[1][3]="D1";
        x[1][4]="E1";

        x[2][0]="A2";
        x[2][1]="B2";
        x[2][2]="C2";
        x[2][3]="D2";
        x[2][4]="E2";

        System.out.println(x[0][0]);

        for ( int p = 0; p<x.length; p++){
            for (int q = 0; q<x[p].length; q++){
                System.out.print(x[p][q]+" ");
            }
            System.out.println();
        }
    }
}
