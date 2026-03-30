class M {
    public static void main(String[] args) {
        boolean flag = Thread.currentThread().isAlive();

        System.out.println(flag);
    }    
}