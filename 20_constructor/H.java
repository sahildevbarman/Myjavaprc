class X1 {
    X1() {
        System.out.println("Y");
    }
}
class X2 extends X1 {
    X2() {
        System.out.println("A");
    }
}
class X3 extends X2 {
    X3() {
        System.out.println("W");
    }
}
class H {
    public static void main(String[] args) {
        System.out.println("T");

        X3 a = new X3();

        System.out.println("D");
    }
}