package a;
public class A {
    private int t = 20;

    private void pro() {
        System.out.println(t);
    }
    
    void info() {
        pro();
    }

    public static void main(String[] args) {
        A x = new A();

        x.info();

        x.pro();

        System.out.println(x.t);
    }
}