package x;

import y.B;

class A implements B {
    void pro() {

    }
}

// x\A.java:6: error: pro() in A cannot implement pro() in B
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error
