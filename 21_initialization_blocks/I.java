class E1 {
    E1() {
        System.out.println("S");
    }
    {
        System.out.println("Y");
    }
    static {
        System.out.println("D");
    }
}
class I extends E1 {
    {
        System.out.println("E");
    }
    static {
        System.out.println("U");
    }
    I() {
        System.out.println("W");
    }
    public static void main(String[] args) {
        System.out.println("Q");
        I a = new I();
        System.out.println("A");
    }     
    
}