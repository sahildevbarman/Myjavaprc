import java.util.ArrayList;

class X {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        for(int i=0; i < x.size(); i++) {
            // System.out.println(x[i]);
            System.out.println(x.get(i));
        }
    }
}


// X.java:14: error: array required, but ArrayList found
//             System.out.println(x[i]);
//                                 ^
// Note: X.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error