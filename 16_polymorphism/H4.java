class H4 {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof SportsCar) {
            System.out.println("SportsCar IS-A SportsCar");
        } else {
            System.out.println("SportsCar IS-not-A SportsCar");
        }
    }
}