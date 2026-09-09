import java.util.ArrayList;
import java.util.Collections;

class U {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        System.out.println(x);

        Collections.sort(x);

        System.out.println(x);
    }
}