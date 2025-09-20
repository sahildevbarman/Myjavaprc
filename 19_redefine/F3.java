class X {
    int a = 9;
}
interface Y {
    int a = 101;
}
class F3 extends X implements Y {
    public static void main(String[] args) {
        System.out.println(Y.a);
    }
}