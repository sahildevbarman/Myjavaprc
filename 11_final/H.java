final class S {
    int y = 99;

    void pro() {
        System.out.println("yamraj");
    }
}

class H {
    public static void main(String[] args) {
        S t = new S();

        System.out.println(t.y);

        t.pro();
    }
}