import java.util.List;
import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();

        // ArrayList<Integer> y = (ArrayList)x;
        ArrayList<Integer> y = (ArrayList<Integer>)x;
    }
}