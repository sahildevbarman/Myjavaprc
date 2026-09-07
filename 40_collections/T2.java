import java.util.ArrayList;

class T2 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = null;
        Integer[] arr = x.toArray(ar);

        for(Integer obj : arr) {
            System.out.println(obj);
        }
    }
}

// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.ArrayList.toArray(ArrayList.java:430)
//         at T2.main(T2.java:14)