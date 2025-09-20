final class Q {
    int j = 9;
}

class I {
    public static void main(String[] args) {
        Q q = new Q();

        System.out.println(q.j);

        q.j = 34;

        System.out.println(q.j);
    }
}