class H2 {
    public static void main(String[] args) {
        Byte a = new Byte((byte)2);
        Byte b = new Byte((byte)2);
        Byte c = new Byte((byte)2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}