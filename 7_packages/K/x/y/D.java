package x.y;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        System.out.println("Bye");
    }
}

// x\y\D.java:3: error: A is not public in a.b.c; cannot be accessed from outside package
// import a.b.c.A;
//             ^
// 1 error