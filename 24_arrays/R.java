class R {
    public static void main(String[] args) {
        int[][] x = new int[2][];

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                System.out.println(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>[<local2>]" is null
//         at R.main(R.java:6)
