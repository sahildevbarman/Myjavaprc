class H1 {
    public static void main(String[] args) {
        Byte a = Byte.valueOf((byte)2);
        Byte b = Byte.valueOf((byte)2);
        Byte c = Byte.valueOf((byte)2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}