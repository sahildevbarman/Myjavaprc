import java.util.ArrayList;

class O {
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

    
    static void pro(ArrayList<Integer> list) {
        for(Integer next : list) {
            System.out.println(next);
        }
    }
    
    static void pro(ArrayList<Double> list) {
        for(Double next : list) {
            System.out.println(next);
        }
    }

    static void pro(ArrayList<Long> list) {
        for(Long next : list) {
            System.out.println(next);
        }
    }
    
}


// O.java:32: error: name clash: pro(ArrayList<Double>) and pro(ArrayList<Integer>) have the same erasure
//     static void pro(ArrayList<Double> list) {
//                 ^
// O.java:38: error: name clash: pro(ArrayList<Long>) and pro(ArrayList<Integer>) have the same erasure
//     static void pro(ArrayList<Long> list) {
//                 ^
// 2 errors