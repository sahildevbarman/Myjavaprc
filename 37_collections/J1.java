import java.util.ArrayList;
class J1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(51);
        x.add(2);
        x.add(5);
        x.add(3);
        x.add(9);

        System.out.println(x);

        Integer a = Integer.valueOf(2);
        // System.out.println(x.remove(2));
        System.out.println(x.remove(a));

        System.out.println(x);
    }
}