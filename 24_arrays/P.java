class P {
    public static void main(String[] args) {
        String[][] x = new String[3][2];

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                System.out.println(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}