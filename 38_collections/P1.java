import java.util.HashSet;
import java.util.Iterator;

class P1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");
        set.add("surya");

        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            String str = (String)itr.next();
            System.out.println(str.length());
        } 
    }    
}