import java.util.ArrayList;

class T3 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Integer[] ar = new Integer[x.size()];
        Integer[] arr = x.toArray(ar);

        for (Integer obj : ar) {
            System.out.println(obj);
        }

        System.out.println(ar == arr);
    }
}