import java.util.ArrayList;

class X1a {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        // for(String y : x) {            
        for(Object y : x) {            
            System.out.println(y.length());
        }
    }
}


// X1a.java:15: error: cannot find symbol
//             System.out.println(y.length());
//                                 ^
//   symbol:   method length()
//   location: variable y of type Object
// Note: X1a.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error