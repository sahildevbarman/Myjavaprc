class C {
    {
        System.out.println("G");
    }

    {
        System.out.println("5");
    }

    public static void main(String[] args) {
        C x = new C();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        // C y = new C();
    }

    {
        System.out.println("K");
    }
}