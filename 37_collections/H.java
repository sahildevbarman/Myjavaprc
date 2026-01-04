import java.util.ArrayList;
class H {
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add(2.34);
        x.add(8.45);
        x.add(7.21);
        x.add(9.01);

        System.out.println(x);

        x.add(2, 5.55);

        System.out.println(x);
    }
}