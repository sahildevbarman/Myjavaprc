class I {
    public static void main(String[] args) {
        Object x = new Bus();

        if(x instanceof SportsCar) {
            System.out.println("Bus IS-A SportsCar");
        } else {
            System.out.println("Bus IS-not-A SportsCar");
        }
    }
}