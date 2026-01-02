class Z {
    public static void main(String[] args) {
        String x = Integer.toOctalString(12);
        String y = Integer.toString(12, 8);

        System.out.println(x);
        System.out.println(y);
    }
}