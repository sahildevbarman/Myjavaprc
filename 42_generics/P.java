class P {
    public static void main(String[] args) {
        pro(12);
        // pro(12.45f);
        // pro(8.9);
    }   
    
    static void pro(int x) {
        System.out.println(x + " --------- #");
    }
    static void pro(float x) {
        System.out.println(x + " #### ~~ ###");
    }
    static void pro(double x) {
        System.out.println(x + " ~~~~~ #### ~~~~");
    }
}