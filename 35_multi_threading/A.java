class A {
    public static void main(String[] args) {
        aaa();
    }
    static void aaa() {
        bbb();
        
        for(int i=0; i<30; i++) {
            System.out.println("aaa() " + i);
        }
    }
    static void bbb() {
        ccc();

        for(int i=0; i<30; i++) {
            System.out.println("bbb() " + i);
        }
    }
    static void ccc() {
        for(int i=0; i<30; i++) {
            System.out.println("ccc() " + i);
        }
    }
}