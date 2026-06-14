import java.util.HashSet;
import java.util.Iterator;

class O {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");

        Iterator itr = set.iterator();
        for(   ; itr.hasNext();  ) {
            System.out.println(itr.next());
        } 
        
        // for(int i=0; i < set.size(); i++) {
        //     System.out.println(set.get(i));
        // }
    }    
}