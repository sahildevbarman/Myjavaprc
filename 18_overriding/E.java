class Y2 {
    // void pro() {
    //     System.out.println("pro in Y2");
    // }
}
class E extends Y2 {
    void pro() {
        System.out.println("pro in Y2");
    }
    public static void main(String[] args) {
        Y2 x = new E();

        x.pro();
    }
}

// E.java:13: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type Y2
// 1 error
