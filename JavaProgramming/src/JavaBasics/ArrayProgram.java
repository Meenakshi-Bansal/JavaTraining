package JavaBasics;

public class ArrayProgram {

    /****************************************************************
     find the highest number in the array
     ****************************************************************/


    public static void main(String[] args) {
        int[] arr = {23, 45, 63, 22, 67, 45, 99, 31, 31};
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        System.out.println("Highest number in array: " + m);
    }

    /****************************************************************
     find the 2nd highest number in the array
     ****************************************************************/

    public static void SecondHigh(String[] args) {
        int[] arr = {21, 45, 60, 48};

        int high = 0;
        int Secondhigh = 0;

        if (arr[1] > arr[0]) {
            high = arr[1];
            Secondhigh = arr[0];
        } else {
            high = arr[0];
            Secondhigh = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > high) {
                Secondhigh = high;
                high = arr[i];
            } else if (arr[i] > Secondhigh) {
                Secondhigh = arr[i];
            }
        }
        System.out.println(Secondhigh);
    }
}
