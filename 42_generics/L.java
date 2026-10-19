import java.util.ArrayList;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(78);
        list.add(12);     
        
        pro(list);
    }

    static void pro(ArrayList x) {
        x.add(true);
        x.add("om");
        for(Object next : x) {
            System.out.println(next);
        }
    }
}