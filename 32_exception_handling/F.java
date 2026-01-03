class F {
    public static void main(String[] args) {
        System.out.println(1);

        String x = null;

        try {
            System.out.println(x.length());
        } catch(NullPointerException e) {
            System.out.println("Problem solved");
        }
        System.out.println(3);
    }
}