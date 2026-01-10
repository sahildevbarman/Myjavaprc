class V {
    public static void main(String[] args) {
        System.out.println("G");
        aaa();
        System.out.println("D");
    }
    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("J");
    }
    static void bbb() {
        System.out.println("W");
        ccc();
        System.out.println("N");
    }
    static void ccc() {
        int x = 12/0;
        System.out.println("Y");
    }
}

// G
// A
// W
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at V.ccc(V.java:18)
//         at V.bbb(V.java:14)
//         at V.aaa(V.java:9)
//         at V.main(V.java:4)