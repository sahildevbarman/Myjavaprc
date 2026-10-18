import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(78);
        list.add(12);        
        
        pro(list);
    }

    static void pro(ArrayList x) {
        for(Object next : x) {
            System.out.println(next);
        }
    }
}