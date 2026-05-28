import java.util.ArrayList;
import java.util.Iterator;

class X3a {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().length() + " =========");
        }
    }
}


// X3a.java:17: error: cannot find symbol
//             System.out.println(itr.next().length() + " =========");
//                                          ^
//   symbol:   method length()
//   location: class Object
// 1 error