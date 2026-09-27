import java.util.TreeSet;

class L {
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
        // String str = new String("kailash");
        String str = new String("sateesh");
        System.out.println(set.ceiling(str));
    }
}