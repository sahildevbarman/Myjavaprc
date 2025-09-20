class Y {
    int y = 99;

    void pro() {
        System.out.println("Hello Ji");
    }
}

class B extends Y {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);
        x.pro();
    }
}