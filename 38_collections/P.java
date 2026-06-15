import java.util.HashSet;
import java.util.Iterator;

class P {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");

        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            // System.out.println(itr.next().length());
            System.out.println(itr.next().toString());
        } 
    }    
}