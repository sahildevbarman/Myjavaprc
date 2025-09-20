class X {
    void info() {
        System.out.println("info methods");
    }
}

class C extends X {
    public static void main(String[] args) {
        C x = new C();

        x.pro();

        System.out.println(x.toString());

        System.out.println(x.hashCode());
    }

    void pro() {
        System.out.println("pro methods");
    }
}