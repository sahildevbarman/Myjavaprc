import java.util.TreeSet;

class T {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(56);
        set.add("mohan");
        set.add(true);
        set.add(5.6);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}