package a;

// import x.B;
// import x.y.C;

import x.*;

class A {
    public static void main(String[] args) {
        B x = new B();
        C y = new C();
    }
}

// a\A.java:11: error: cannot find symbol
//         C y = new C();
//         ^
//   symbol:   class C
//   location: class A
// a\A.java:11: error: cannot find symbol
//         C y = new C();
//                   ^
//   symbol:   class C
//   location: class A
// 2 errors