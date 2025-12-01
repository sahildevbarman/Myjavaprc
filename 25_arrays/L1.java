class L1 {
    public static void main(String[] args) {
        int[] x = {23,56,78,12,9};

        int[] y = new int[x.length];

        for(int w : y) {
            System.out.print(w + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0; i < x.length; i++) {
            y[i] = x[x.length-i-1];
        }
        for(int w : y) {
            System.out.print(w + " ");
        }
    }
}