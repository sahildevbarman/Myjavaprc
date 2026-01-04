import java.util.ArrayList;
class G {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("mohan");
        x.add("gohan");
        x.add("tohan");
        x.add("mohan");

        System.out.println(x);

        boolean flag = x.remove("mohan");

        System.out.println(flag);
        System.out.println(x);
    }
}