class F1 {
    {
        System.out.println("G");
    }
    {
        System.out.println("5");
    }
    F1() {
        // super();
        
        System.out.println("J");
    }
    public static void main(String[] args) {
        System.out.println("Y");
        F1 x = new F1();
        System.out.println("T");
    }
    {
        System.out.println("K");
    }
}