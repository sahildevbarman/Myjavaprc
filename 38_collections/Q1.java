import java.util.HashSet;

class Q1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");
        set.add("surya");
        set.add("pawan");

        for(String a : set) {
            System.out.println(a);
        } 
    }    
}