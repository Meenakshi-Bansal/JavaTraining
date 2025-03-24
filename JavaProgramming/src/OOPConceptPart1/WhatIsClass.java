package OOPConceptPart1;

public class WhatIsClass {

    // Class Variables

    int classname;
    int classvalue;

    public static void main(String[] args) {

        // Class is the set of methods, properties and its values.
        // Class will be having its own variables. If you want to access those variables, you have to create objects.

        // new WhatIsClass(); This is object which is created for class.
        // a, b, and c are the object referenced variables.
        // new is used to create an object and also used to provide space in java heap memory to an object.

        // Now a can access all the variables of class "WhatIsClass". Same goes for object variable b and c.

        WhatIsClass a = new WhatIsClass();
        WhatIsClass b = new WhatIsClass();
        WhatIsClass c = new WhatIsClass();

        // Provide value to object a

        a.classname = 9;
        a.classvalue = 40;

        b.classname = 10;
        b.classvalue = 50;

        c.classname = 8;
        c.classvalue = 60;

        System.out.println(a.classname);

        System.out.println ("After shifting the references");

        a=b;
        b=c;
        c=a;

        //Now a and c will be referenced to values of b's
        // and C will be reference to c values.

        //a.classname = 10;
        System.out.println(a.classname);
        System.out.println(c.classname);
        System.out.println(b.classname);


    }
}
