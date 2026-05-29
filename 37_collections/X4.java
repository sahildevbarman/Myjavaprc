import java.util.ArrayList;
import java.util.Iterator;

class X4 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        Iterator<String> itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().length() + " =##===!!=====");
        }
    }
}