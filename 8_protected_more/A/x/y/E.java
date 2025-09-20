package x.y;

import a.b.c.A;

class E {
    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }
}

// x\y\E.java:9: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error
