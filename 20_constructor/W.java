class E1 {
    E1() {
        this(2);
    }
    E1(int y) {
        this();
    }
}
class W {
    public static void main(String[] args) {
        E1 x = new E1(12);
    }
}

// W.java:6: error: recursive constructor invocation
//         this();
//         ^
// 1 error