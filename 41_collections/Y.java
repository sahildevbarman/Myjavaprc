import java.util.List;
import java.util.Arrays;

class Y {
    public static void main(String[] args) {
        Integer[] x = { 78, 12, 62, 54, 39 };

        // backed list
        List<Integer> list = Arrays.asList(x);

        list.add(99);
    }
}

// Exception in thread "main" java.lang.UnsupportedOperationException
// at java.base/java.util.AbstractList.add(AbstractList.java:153)
// at java.base/java.util.AbstractList.add(AbstractList.java:111)
// at Y.main(Y.java:11)