package JavaBasics;

public class StringConcatenation {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        String x = "Meenakshi";

        System.out.println("Addition:" + (a + b)); //Addition:300
        System.out.println(a+x+a+b+x); //100Meenakshi100200Meenakshi
        System.out.println(a+b+x); //300Meenakshi
        System.out.println(x+a+b); //Meenakshi100200
    }
}
