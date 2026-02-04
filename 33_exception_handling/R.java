class R {
    public static void main(String[] args) {
        try {
            String x = "mohan";

            System.out.println(x.charAt(100));

            int[] y = {12, 45, 76};
            System.out.println(y[3]);
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundException e) {
            e.printStackTrace();
        }
    }
}

// R.java:12: error: cannot find symbol
//         } catch(ArrayIndexOutOfBoundException e) {
//                 ^
//   symbol:   class ArrayIndexOutOfBoundException
//   location: class R
// 1 error
