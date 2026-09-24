import java.util.TreeSet;

class I {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("kailash");
        set.add("balwant");
        set.add("ritesh");
        set.add("gajendra");
        set.add("narayan");
        set.add("chetan");

        System.out.println(set.first());
        System.out.println(set.last());
    }
}