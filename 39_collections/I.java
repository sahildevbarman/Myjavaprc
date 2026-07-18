class I {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(12);
        Integer y = Integer.valueOf(45);
        Integer z = Integer.valueOf(45);

        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));
        System.out.println(y.compareTo(z));
    }
}