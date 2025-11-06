class Z {
    public static void main(String[] args) {
        int[] x = {18, 23, 67, 45, 12, 9, 81, 62, 39};

        int min = x[0];

        for(int i=0; i < x.length; i++) {
            if(x[i] < min) 
                min = x[i];
        }

        System.out.println(min);
    }
}