import java.util.ArrayList;

class R {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(12);
        x.add(15);
        x.add(18);

        ArrayList<Double> y = new ArrayList<>();
        y.add(6.7);
        y.add(8.2);
        y.add(11.9);

        ArrayList<Long> z = new ArrayList<>();
        z.add(4L);
        z.add(11L);
        z.add(89L);

        pro(x);
        pro(y);
        pro(z);
    }

    
    static void pro(ArrayList list) {
        for(Object next : list) {
            System.out.println(next);
        }
    }
    
}