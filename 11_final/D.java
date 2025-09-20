class W {
    int e = 9;

    void pro() {
        System.out.println("Jay");
    }
}

class D {
    public static void main(String[] args) {
        D x = new D();

        System.out.println(x.e);
        x.pro();
    }
}

// D.java:13: error: cannot find symbol
//         System.out.println(x.e);
//                             ^
//   symbol:   variable e
//   location: variable x of type D
// D.java:14: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type D
// 2 errors