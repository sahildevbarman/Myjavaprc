class S {
    public static void main(String[] args) {
        String x = "ab aab aaab aaaab";

        int fromIndex = 0;
        while((fromIndex=x.indexOf('b', fromIndex)) != -1) {
            System.out.println(fromIndex++);
        }
    }
}