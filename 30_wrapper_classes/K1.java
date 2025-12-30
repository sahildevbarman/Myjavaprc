class K1 {
    public static void main(String[] args) {
        Long a = Long.valueOf(2L);
        Long b = Long.valueOf(2L);
        Long c = Long.valueOf(2L);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}