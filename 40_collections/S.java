import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Object[] arr = x.toArray();

        for(Object obj : arr) {
            System.out.println(obj);
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // System.out.println(arr.get(0));
    }
}