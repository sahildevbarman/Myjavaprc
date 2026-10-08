import java.util.List;
import java.util.Arrays;

class X {
    public static void main(String[] args) {
        Integer[] x = {78, 12, 62, 54, 39};
        
        //backed list
        List<Integer> list = Arrays.asList(x);

        for(Integer rec : x) {
            System.out.print(rec + " ");
        }

        System.out.println();
        list.set(1, 111);

        for(Integer rec : x) {
            System.out.print(rec + " ");
        }
    }
}