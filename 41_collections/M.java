import java.util.TreeSet;

class M {
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

        // String str = new String("gajodhar");
        String str = new String("manas");
        // String str = new String("kaashi");
        System.out.println(set.floor(str));
    }
}