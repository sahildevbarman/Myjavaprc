class K2 {
    public static void main(String[] args) {
        Long a = new Long(2L);
        Long b = new Long(2L);
        Long c = new Long(2L);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(c.equals(a));
        System.out.println(c.equals(b));
    }
}