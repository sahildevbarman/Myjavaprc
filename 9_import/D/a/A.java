package a;

// import b.B;
// import c.d.B;

class A {
    public static void main(String[] args) {
        b.B x = new b.B();

        System.out.println(x.y);

        c.d.B z = new c.d.B();

        System.out.println(z.y);
    }
}