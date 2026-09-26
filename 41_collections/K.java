import java.util.TreeSet;

class K {
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

        // String str = new String("yamraj");
        // String str = new String("ishita");
        String str = new String("gajendra");
        System.out.println(set.tailSet(str));
    }
}