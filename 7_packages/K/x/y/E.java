package x.y;

import a.b.c.A;

class E extends A {
    public static void main(String[] args) {
        System.out.println("Bye");
    }
}

// x\y\E.java:3: error: A is not public in a.b.c; cannot be accessed from outside package
// import a.b.c.A;
//             ^
// x\y\E.java:5: error: A is not public in a.b.c; cannot be accessed from outside package
// class E extends A {
//                 ^
// 2 errors