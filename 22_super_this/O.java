class J1 {
    J1() {
        System.out.println(this + " ~~~~~~~1");
    }
}
class J2 extends J1 {
    J2() {
        System.out.println(this + " ~~~~~~~2");
    }
}
class O extends J2 {
    O() {
        System.out.println(this + " ~~~~~~~~3");
    }
    public static void main(String[] args) {
        O x = new O();

        System.out.println(x + " ~~~~~~~4");
    }
}