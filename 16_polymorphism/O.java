class O {
    public static void main(String[] args) {
        SpiderMan y = new SpiderMan();
        ShaktiMan z = new ShaktiMan();

        inviteForDinner(z);
        inviteForDinner(y);
    }
    static void inviteForDinner(SpiderMan x) {
        System.out.println("Namaste");
        System.out.println("Serve Food");
    }
    static void inviteForDinner(ShaktiMan x) {
        System.out.println("Namaste");
        System.out.println("Serve Food");
    }
}