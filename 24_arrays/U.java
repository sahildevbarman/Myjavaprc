class U {
    public static void main(String[] args) {
        int[][] x = {{4, 9, 12, 2, 21}, {11, 23, -3}, {7, 1, 8, 6, 3, 0, 13}, {'A', 'B', 'C'}};

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                System.out.println(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}