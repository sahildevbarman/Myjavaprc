import java.util.ArrayList;
class I1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(2.34);
        x.add(8.45);
        x.add(7.21);
        x.add(9.01);

        System.out.println(x);

        x.add(20, 5.55);
        // x.set(20, 5.55);

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 20, Size: 4
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:838)
//         at java.base/java.util.ArrayList.add(ArrayList.java:510)
//         at I1.main(I1.java:13)