package OOPConceptPart1;

public class CallByValAndCallByRef {

    int a, b;

    public static void main(String[] args){

        CallByValAndCallByRef obj = new CallByValAndCallByRef();
        int m = 50;
        int n = 60;

        // Call by value
        System.out.println(obj.sum(m,n));


        // Call by reference - Where we are creating a reference of your call with reference and
        // passing the values of object reference variables.
        obj.swap(obj);
        obj.a = 50;
        obj.b = 60;
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public int sum(int x, int y){
        x = 30;
        y = 40;
        int c = x+y;
        return c;

    }

    public void swap (CallByValAndCallByRef t){
        int temp = t.a;
        t.a = t.b;
        t.b = temp;

    }
}
