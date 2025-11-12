class V {
    public static void main(String[] args) {
        int[][] x = new int[][] { {4, 9, 12, 2}, {11, 23}, {7, 1, 8, 6, 3} };

        for(int[] t : x) {
            for(int s : t) {
                System.out.println(s + " ");
            }
            System.out.println();
        }
    }
}