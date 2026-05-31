import java.util.ArrayList;

class Y1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        System.out.println(x);

        int size = x.size();
        for(int i=0; i < size; i++) {
            System.out.println(x.remove(i));
        }

        System.out.println(x);
    }
}




// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
//         at java.base/java.util.Objects.checkIndex(Objects.java:372)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:536)
//         at Y1.main(Y1.java:17)