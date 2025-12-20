class X {
    public static void main(String[] args) {
        String[] x = {"my name is:", "%s", "and my age is:", "%d"};

        String y = "My Info => ";

        String z = y.concat(String.format(String.join(" ", x), "om", 12));
        System.out.println(z);
    }
}