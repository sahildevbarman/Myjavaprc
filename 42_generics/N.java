import java.util.ArrayList;

class N {
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

    static void pro(ArrayList<Number> list) {
        for(Number next : list) {
            System.out.println(next);
        }
    }
}




// N.java:20: error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Number>
//         pro(x);
//             ^
// N.java:21: error: incompatible types: ArrayList<Double> cannot be converted to ArrayList<Number>
//         pro(y);
//             ^
// N.java:22: error: incompatible types: ArrayList<Long> cannot be converted to ArrayList<Number>
//         pro(z);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors