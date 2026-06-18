import java.util.HashSet;

class Q {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");
        set.add("surya");

        for (Object a : set) {
            System.out.println(a);
        }
    }
}