class B {
    public static void main(String[] args) {
        int[] y = {10, 51, 17, 23, 7};

        // for(int i=0; i < y.length; i++) {
        //     System.out.println(y[i]);
        // }

        for(int next : y) {
            System.out.println(next);
        }
    }
}