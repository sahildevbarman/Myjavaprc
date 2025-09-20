package x.y;

import a.b.c.A;

class B extends A {
    public static void main(String[] args) {
        // B x = new B();
        A x = new A();

        x.pro();
    }
}

// x\y\B.java:10: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error
