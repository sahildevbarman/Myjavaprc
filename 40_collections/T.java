import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = new Integer[0];
        Integer[] arr = x.toArray(ar);

        for(Integer obj : arr) {
            System.out.println(obj);
        }
    }
}



// T.java:14: error: incompatible types: Object[] cannot be converted to Integer[]
//         Integer[] arr = x.toArray(ar);
//                                  ^
// Note: T.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error