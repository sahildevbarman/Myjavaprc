class T {
    public static void main(String[] args) {
        int[][] x = new int[][] {{4, 9, 12, 2}, {11, 23}, {7, 1, 8, 6, 3}};

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                System.out.println(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}