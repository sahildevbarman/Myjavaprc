import java.util.ArrayList;
class K {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(51);
        x.add(2);
        x.add(5);
        x.add(3);
        x.add(9);

        System.out.println(x);

        System.out.println(x.remove(9));

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 5
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//         at java.base/java.util.Objects.checkIndex(Objects.java:385)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:551)
//         at K.main(K.java:14)
