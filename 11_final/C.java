class Z {
    int y = 100;

    void pro() {
        System.out.println("Hello Ji");
    }
}

class C extends Z {
    void pro() {
        System.out.println("Hi Ji");
    }

    public static void main(String[] args) {
        C x = new C();

        System.out.println(x.y);
        x.pro();
    }
}