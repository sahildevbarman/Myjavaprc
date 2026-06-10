import java.util.HashSet;

class K {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set);

        set.add(56);
        set.add(12);
        set.add(68);
        set.add(21);
        set.add(19);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set);
    }    
}