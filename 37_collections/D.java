import java.util.ArrayList;
class D {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        // boolean flag = x.contains("eohan");
        boolean flag = x.contains("rohan");

        System.out.println(flag);
    }
}