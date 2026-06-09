import java.util.Vector;

class I {
    public static void main(String[] args) {
        Vector v = new Vector(10, 2);

        v.add(1);
        v.add(11);
        v.add(21);
        v.add(31);
        v.add(41);
        v.add(51);
        v.add(61);
        v.add(71);
        v.add(81);
        v.add(91);

        System.out.println(v.capacity());
        
        v.add(101);

        System.out.println(v.capacity());
    }
}