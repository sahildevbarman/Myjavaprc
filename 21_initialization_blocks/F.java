class F {
    {
        System.out.println("G");
    }
    {
        System.out.println("5");
    }
    public static void main(String[] args) {
        System.out.println("Y");
        F x = new F();
        System.out.println("T");
    }
    {
        System.out.println("K");
    }
}