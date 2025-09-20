class N {
    static int y = 2;

    public static void main(String[] args) {
        N n1 = new N();
        n1.y = 4;
        N n2 = new N();
        n2.y = 5;

        System.out.println(n1.y);
    }
}