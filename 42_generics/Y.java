import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        ArrayList x = pro();
    }

    static ArrayList<? extends Number> pro() {
        // return new ArrayList<String>();  //not ok
        // return new ArrayList<Integer>();
        return new ArrayList<Number>();
    }
}
