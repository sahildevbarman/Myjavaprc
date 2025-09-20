class AAA {
    /*private*/ void pro() {

    }
}
class BBB extends AAA {
    static void pro() {

    }
}

// P1.java:7: error: pro() in BBB cannot override pro() in AAA
//     static void pro() {
//                 ^
//   overriding method is static
// 1 error
