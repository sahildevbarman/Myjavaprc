class R {
    public static void main(String[] args) {
        String x = "ab aab aaab aaaab";

        System.out.println(x.indexOf('b'));
        System.out.println(x.indexOf('b', 2));
        System.out.println(x.indexOf('b', 6));
        System.out.println(x.indexOf('b', 11));
    }
}