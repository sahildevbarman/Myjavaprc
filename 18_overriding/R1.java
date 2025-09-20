class HH {
    static void pro() {

    }
}
class GG extends HH {
    static int pro() {
        return 23;
    }
}

// R1.java:7: error: pro() in GG cannot hide pro() in HH
//     static int pro() {
//                ^
//   return type int is not compatible with void
// 1 error