
V.java
100%
import java.util.ArrayList;

class V {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        
        x.add(12);
        x.add(15);
        x.add(18);
        
        pro(x);
    }

    
    static void pro(ArrayList<? extends Number> list) {
        for(Object next : list) {
            System.out.println(next);
        }

        // list.add(12);
        list.remove(1);
    }
    
}
Displaying V.java.