class AAA {
    /*private*/ void pro() {

    }
}
class BBB extends AAA {
    public int pro() {
        return 2;
    }
}

// P.java:7: error: pro() in BBB cannot override pro() in AAA
//     public int pro() {
//                ^
//   return type int is not compatible with void
// 1 error