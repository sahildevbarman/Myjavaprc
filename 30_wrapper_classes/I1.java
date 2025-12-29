class I1 {
    public static void main(String[] args) {
        Short a = Short.valueOf((short)2);
        Short b = Short.valueOf((short)2);
        Short c = Short.valueOf((short)2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}