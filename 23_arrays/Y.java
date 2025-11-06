class Y {
    public static void main(String[] args) {
        int[] x = {18, 23, 67, 45, 12, 9, 81, 62, 39};

        int max = x[0];

        for(int i=0; i < x.length; i++) {
            // System.out.println("i(index): " + i + " _ " + "X["+i+"]: " + x[i]);
            if(x[i] > max)
                max = x[i]; 
        }
        
        System.out.println(max);
    }
}