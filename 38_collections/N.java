import java.util.HashSet;

class N {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(56);
        set.add(12);
        set.add(68);
        set.add(21);
        set.add(19);
        
        System.out.println(set);
        // System.out.println(set.remove(68));
        System.out.println(set.remove(99));
        System.out.println(set);
    }    
}