class C1 {
    private void pro() {
        System.out.println("Hi");
    }
}
class D1 extends C1 {

}
class J {
    public static void main(String[] args) {
        D1 x = new D1();

        x.pro();
    }
}

// J.java:13: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type D1
// 1 error
