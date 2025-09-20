class C3 {
    private void pro() {
        System.out.println("Hi");
    }
}
class D3 extends C3 {
    void pro() {
        System.out.println("Hello");
    }
}
class J2 {
    public static void main(String[] args) {
        D3 x = new D3();

        x.pro();
    }
}