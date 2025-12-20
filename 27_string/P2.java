class P2 {
    public static void main(String[] args) {
        String x = "mohan, Raju, Vikram, Sudheer";

        String[] y = x.split(", ");

        for(String tmp : y) {
            System.out.println(tmp);
        }
        System.out.println(x);
    }
}