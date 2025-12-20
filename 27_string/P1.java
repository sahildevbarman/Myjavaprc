class P1 {
    public static void main(String[] args) {
        String x = "mohan is a good boy and he is my best frien he lives on an island";

        String[] y = x.split("is");

        for(String tmp : y) {
            System.out.println(tmp);
        }
        System.out.println(x);
    }
}