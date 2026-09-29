import java.util.TreeSet;

class N {
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

        
        // String str = new String("isha");
        String str = new String("kailash");
        
        System.out.println(set.headSet(str, true));
    }
}