class X1 {
    {
        System.out.println("H");
    }
    X1() {
        System.out.println("F");
    }
    {
        System.out.println("O");
    }
}
class G extends X1 {
    {
        System.out.println("1");
    }
    {
        System.out.println("V");
    }
    G() {
        this(23);
        System.out.println("S");
    }
    G(int y) {
        System.out.println("Z");
    }
    public static void main(String[] args) {
        System.out.println("D");
        G x = new G();
        System.out.println("X");
    }
    {
        System.out.println("U");
    }
}