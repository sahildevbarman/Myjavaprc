import java.util.TreeSet;

class J {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("kailash");
        set.add("balwant");
        set.add("ritesh");
        set.add("gajendra");
        set.add("narayan");
        set.add("chetan");

        // String str = new String("gajendra");
        String str = new String("kaashi");
        System.out.println(set.headSet(str));
    }
}