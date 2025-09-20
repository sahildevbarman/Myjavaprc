class C2 {
    private void pro() {
        System.out.println("Hi");
    }
}
class D2 extends C2 {
    void pro() {
        System.out.println("Hello");
    }
}
class J1 {
    public static void main(String[] args) {
        C2 x = new D2();

        x.pro();
    }
}

// J1.java:15: error: pro() has private access in C2
//         x.pro();
//          ^
// 1 error