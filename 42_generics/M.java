import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(true);
        list.add(3.4);
        list.add("umesh");

        pro(list);
    }

    static void pro(ArrayList<String> x) {
        x.add("ram");
        for(Object str : x) {
            System.out.println(str);
        }
    }
}