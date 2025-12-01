class N {
    public static void main(String[] args) {
        int[] x = {23,56,78,12,9,55,1};

        int[] y = new int[x.length];

        for(int w : y) {
            System.out.print(w + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i=0, j=x.length-1; j >= 0; i++, j--) {
            y[j] = x[i];
        }
        for(int w : y) {
            System.out.print(w + " ");
        }
    }
}