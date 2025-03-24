package OOPConceptPart1;

public class FunctionsInJava {

    /*********************************************************************************************
     * Function in Java has two types
     * Static Functions
     * Non Static Functions
     *********************************************************************************************/

    public static void main(String[] args) {

        FunctionsInJava obj = new FunctionsInJava();
        obj.test1();
        int value = obj.test();
        System.out.println(value);

        int value2 = obj.divison(30, 10);
        System.out.println(value2);
    }

    public void test1()     //When method has no input and no output
    {
        System.out.println("New Method/New Function");
    }

    public int test() {     //When your method has no input and have output
        System.out.println("Test Method");
        int a = 10;
        return a;
    }

    public int divison(int x, int y) {
        System.out.println("Divison Method");
        int d = x / y;
        return d;
    }

}
