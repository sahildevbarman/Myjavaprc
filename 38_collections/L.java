import java.util.HashSet;

class L {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set);

        set.add(56);
        set.add(12);
        set.add(68);
        set.add(56);
        set.add(21);
        set.add(19);
        set.add(56);

        System.out.println(set);
    }
}