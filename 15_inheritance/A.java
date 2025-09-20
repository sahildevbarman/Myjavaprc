class A {
    public static void main(String[] args) {
        pqr();

        pro();

        mno();
    }

    static void pro() {
        System.out.println("pro");
    }
}

// A.java:3: error: cannot find symbol
//         pqr();
//         ^
//   symbol:   method pqr()
//   location: class A
// A.java:7: error: cannot find symbol
//         mno();
//         ^
//   symbol:   method mno()
//   location: class A
// 2 errors