class P {
    public static void main(String[] args) {
        String x = "mohan is a good boy";

        String[] y = x.split(" ");

        for(String tmp : y) {
            System.out.println(tmp);
        }
        System.out.println(x);
    }
}