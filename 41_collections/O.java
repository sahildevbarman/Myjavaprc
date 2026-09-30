import java.util.TreeSet;

class O {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("kailash");
        set.add("balwant");
        set.add("ritesh");
        set.add("gajendra");
        set.add("narayan");
        set.add("chetan");
        set.add("ishali");
        set.add("manas");

        String str = new String("teena");
        // String str = new String("kailash");

        System.out.println(set.tailSet(str, true));
    }
}