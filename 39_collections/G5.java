import java.util.TreeSet;
import java.util.Iterator;

class G5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");
        set.add("virendravikram");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            // String str = (String)itr.next();
            System.out.println(itr.next().length());
        }
    }
}