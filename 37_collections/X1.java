import java.util.ArrayList;

class X1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        // for(String y : x) {            
        for(Object y : x) {            
            System.out.println(y + " ~~");
        }
    }
}