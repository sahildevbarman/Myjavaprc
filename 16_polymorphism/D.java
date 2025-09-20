class X2 extends X1 {

}
class X1 {

}
class D {
    public static void main(String[] args) {
        // X1 x = new X2();

        X2 y = new X1();
    }
}

// D.java:11: error: incompatible types: X1 cannot be converted to X2
//         X2 y = new X1();
//                ^
// 1 error
