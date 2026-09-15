import java.util.Collections;
import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(18);
        list.add(48);
        list.add(67);
        list.add(23);
        list.add(59);

        System.out.println(list);

        // Integer x = Integer.valueOf(48);
        // Integer x = Integer.valueOf(23);
        Integer x = Integer.valueOf(78);
        System.out.println(Collections.binarySearch(list, x));
    }    
}