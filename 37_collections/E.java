import java.util.ArrayList;
class E {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        // boolean flag = x.remove("rohan");
        boolean flag = x.remove("eohan");

        System.out.println(flag);
        System.out.println(x);
    }
}