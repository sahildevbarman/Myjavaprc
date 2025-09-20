class L {
    String m = "om";

    public static void main(String[] args) {
        L x = new L();

        x.pro();
    }

    void pro() {
        System.out.println(x.m);
    }
}

// L.java:11: error: cannot find symbol
//         System.out.println(x.m);
//                            ^
//   symbol:   variable x
//   location: class L
// 1 error
