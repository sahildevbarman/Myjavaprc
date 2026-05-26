import java.util.ArrayList;

class X2 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        for(String y : x) {         
            System.out.println(y + " ##");
            System.out.println(y.length() + " ##");
        }
    }
}