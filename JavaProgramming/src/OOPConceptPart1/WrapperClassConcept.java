package OOPConceptPart1;

public class WrapperClassConcept {

    public static void main (String [] args) {

        String x = "100";
        System.out.println(x+20);

        // Data Conversion from String to Int
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        // String to Double Conversion
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d);

        // String to Boolen Convenrion
        String z = "True";
        boolean b = Boolean.parseBoolean(z);
        System.out.println(b);

        // int to string conversion
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s+10);

    }
}
