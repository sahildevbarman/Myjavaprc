import java.util.List;
import java.util.Arrays;

class W {
    public static void main(String[] args) {
        Integer[] x = {78, 12, 62, 54, 39};
        
        //backed list
        List<Integer> list = Arrays.asList(x);

        System.out.println(list);

        x[2] = 99;

        System.out.println(list);
    }
}