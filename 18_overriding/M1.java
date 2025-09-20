class AAA {
    protected void pro() {

    }
}
class BBB extends AAA {
    void pro() {

    }
}

// M1.java:7: error: pro() in BBB cannot override pro() in AAA
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was protected
// 1 error
