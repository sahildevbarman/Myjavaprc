class A2 {
    final void pro() {
        System.out.println("Hi");
    }
}
class B2 extends A2 {
    void pro() {
        System.out.println("Hello");
    }
}

// I1.java:7: error: pro() in B2 cannot override pro() in A2
//     void pro() {
//          ^
//   overridden method is final
// 1 error
