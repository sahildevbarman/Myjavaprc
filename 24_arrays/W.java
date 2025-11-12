class W {
    public static void main(String[] args) {
        String[][] y = {{"a", "b"}, {"c", "d", "e", "f", "g"}, {"h", "i", "j"}};

        for(String[] s : y) {
            for(String k : s) {
                System.out.println(k + " ");
            }
            System.out.println();
        }
    }
}